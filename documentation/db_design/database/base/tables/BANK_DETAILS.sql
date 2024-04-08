
CREATE TABLE IF NOT EXISTS BASE.BANK_DETAILS (
	BANK_ID INTEGER NOT NULL DEFAULT NEXTVAL('BASE.BANK_DETAILS_BANK_ID'::regclass),
	BANK_CODE character varying(50) NOT NULL,
	BANK_ACCOUNT character varying(50) NOT NULL,
	ACCOUNT_HOLDER character varying(50) NOT NULL,
	BANK_KEY character varying(50) NOT NULL,
	VAT_REG_NO character varying(50) NOT NULL,	
	VAT_REG_NO2 character varying(50),
	VAT_REG_NO3 character varying(50), 
	BANK_NAME character varying(100) NOT NULL,
	BRANCH character varying(100) NOT NULL,
	ADDRESS1 character varying(500) NOT NULL,
	ADDRESS2 character varying(500),
	ADDRESS3 character varying(500),
	CITY character varying(50) NOT NULL,
	STATE character varying(50) NOT NULL,
	COUNTRY character varying(50) NOT NULL,
	COUNRY_CODE character varying(50) NOT NULL,
	POSTAL_CODE character varying(50) NOT NULL,
	CONSTRAINT BANK_ID_pkey PRIMARY KEY (BANK_ID),
	CONSTRAINT bank_account_uk UNIQUE (BANK_CODE, BANK_ACCOUNT)
);