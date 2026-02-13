-- Drop the table if it already exists (optional, useful for re-running the script during development)
DROP TABLE IF EXISTS app.exchange_rates;

-- Create the ExchangeRates table in PostgreSQL
CREATE TABLE app.exchange_rates (
    id SERIAL PRIMARY KEY, -- PostgreSQL-specific auto-incrementing integer
    base_currency CHAR(3) NOT NULL,
    target_currency CHAR(3) NOT NULL,
    exchange_rate DECIMAL(18, 6) NOT NULL,
    effective_date DATE NOT NULL,
    last_updated TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP -- PostgreSQL specific, stores timezone
);

-- Create a unique constraint to prevent duplicate rates for the same base, target, and date
ALTER TABLE app.exchange_rates
ADD CONSTRAINT UQ_RateDate UNIQUE (base_currency, target_currency, effective_date);

-- Insert sample data (based on rates around the current date of Jan 27, 2026)
INSERT INTO app.exchange_rates (base_currency, target_currency, exchange_rate, effective_date) VALUES
('EUR', 'USD', 1.087300, '2026-01-27'),
('EUR', 'GBP', 0.852100, '2026-01-27'),
('EUR', 'JPY', 160.150000, '2026-01-27'),
('USD', 'EUR', 0.919600, '2026-01-27'),
('USD', 'GBP', 0.783600, '2026-01-27'),
('USD', 'JPY', 147.300000, '2026-01-27'),
-- Sample historical data
('EUR', 'USD', 1.091000, '2026-01-26'),
('USD', 'EUR', 0.916500, '2026-01-26');

-- Optional: Select the data to verify the inserts
SELECT * FROM app.exchange_rates ORDER BY effective_date DESC, base_currency, target_currency;
