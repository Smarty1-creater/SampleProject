-- Create the database
CREATE DATABASE realestate_db;

-- Use the database
USE realestate_db;

-- Create the property table
CREATE TABLE property (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL
);
-- Create a table
CREATE TABLE property (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL
);

-- Insert data into the table
INSERT INTO property (name, address, price) VALUES ('House 1', '123 Main St', 250000.00);
-- Inserting sample property data
INSERT INTO property (name, address, price) VALUES ('Luxury Villa', '123 Palm Grove, Miami, FL', 1500000.00);
INSERT INTO property (name, address, price) VALUES ('Cozy Apartment', '456 Maple Street, New York, NY', 500000.00);
INSERT INTO property (name, address, price) VALUES ('Family Home', '789 Oak Avenue, Los Angeles, CA', 800000.00);
INSERT INTO property (name, address, price) VALUES ('Seaside Condo', '101 Ocean Drive, Santa Monica, CA', 1200000.00);
INSERT INTO property (name, address, price) VALUES ('Mountain Retreat', '234 Pine Trail, Denver, CO', 650000.00);
INSERT INTO property (name, address, price) VALUES ('Urban Loft', '567 Main Street, Chicago, IL', 700000.00);
INSERT INTO property (name, address, price) VALUES ('Country Farmhouse', '890 Farm Road, Austin, TX', 950000.00);
INSERT INTO property (name, address, price) VALUES ('Historic Mansion', '111 Grand Avenue, Boston, MA', 2500000.00);
INSERT INTO property (name, address, price) VALUES ('Lakefront Cottage', '222 Lakeview Drive, Seattle, WA', 550000.00);
INSERT INTO property (name, address, price) VALUES ('City Penthouse', '333 Skyline Avenue, San Francisco, CA', 1800000.00);
INSERT INTO property (name, address, price) VALUES ('Suburban Townhouse', '444 Birch Lane, Dallas, TX', 600000.00);
INSERT INTO property (name, address, price) VALUES ('Rural Cabin', '555 Forest Road, Portland, OR', 350000.00);
INSERT INTO property (name, address, price) VALUES ('Beach House', '666 Sandy Beach Blvd, Miami, FL', 1400000.00);
INSERT INTO property (name, address, price) VALUES ('Modern Condominium', '777 Highrise Lane, New York, NY', 900000.00);
INSERT INTO property (name, address, price) VALUES ('Golf Course Villa', '888 Fairway Drive, Phoenix, AZ', 1100000.00);
INSERT INTO property (name, address, price) VALUES ('Downtown Studio', '999 Urban Street, San Diego, CA', 450000.00);
INSERT INTO property (name, address, price) VALUES ('Hillside Bungalow', '121 Hillcrest Road, Nashville, TN', 400000.00);
INSERT INTO property (name, address, price) VALUES ('Country Estate', '232 Country Lane, Atlanta, GA', 1300000.00);
INSERT INTO property (name, address, price) VALUES ('Riverfront Retreat', '343 Riverside Avenue, Denver, CO', 720000.00);
INSERT INTO property (name, address, price) VALUES ('Ski Chalet', '454 Alpine Way, Salt Lake City, UT', 850000.00);

-- Query data from the table
SELECT * FROM property;