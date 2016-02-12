-- 31.01.2016

create TABLE patient (

  id_patient INT NOT NULL,
  id_dentist INT,
  profession_job VARCHAR(50),
  company_name VARCHAR(200),
  title VARCHAR(50),
  last_name VARCHAR(200),
  first_name VARCHAR(200),
  email VARCHAR(100),
  address VARCHAR(250),
  postal_code VARCHAR(20),
  city VARCHAR(100),
  date_birth DATE,
  place_birth VARCHAR(100),
  language VARCHAR(100),
  nationality VARCHAR(100),
  personal_phone VARCHAR(30),
  office_phone VARCHAR(30),
  fax VARCHAR(30),
  fiscal_code VARCHAR(30),
  id_profile_photo INT,
  type INT,
  gender VARCHAR(20),
  last_visit_date DATE,
  next_visit_date DATE,
  first_visit_date DATE,
  last_prediction_date DATE,
  note TEXT,
  discount DECIMAL,
  insurance VARCHAR(100),
  family_doctor VARCHAR(100),
  family_doctor_phone VARCHAR(20),
  adult_teen VARCHAR(40),
  creation_date DATE,
  id_family INT,
  note1 TEXT,
  note2 TEXT,
  note3 TEXT,
  note4 TEXT,
  note5 TEXT,
  note6 TEXT,
  note7 TEXT,
  note8 TEXT,
  last_update_date DATE,
  user_update VARCHAR(50)

);

ALTER TABLE patient ADD PRIMARY KEY (id_patient);

ALTER TABLE patient MODIFY COLUMN id_patient INT AUTO_INCREMENT;