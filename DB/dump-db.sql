--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.1
-- Dumped by pg_dump version 9.5.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: attivita; Type: TABLE; Schema: static; Owner: postgres
--

CREATE TABLE attivita (
    id_attivita integer NOT NULL,
    nome_attivita character varying(45) NOT NULL,
    id_progetto integer
);


ALTER TABLE attivita OWNER TO postgres;

--
-- Name: attivita_utente; Type: TABLE; Schema: static; Owner: postgres
--

CREATE TABLE attivita_utente (
    id_attivita_utente integer NOT NULL,
    id_utente integer NOT NULL,
    id_attivita integer NOT NULL
);


ALTER TABLE attivita_utente OWNER TO postgres;

--
-- Name: client; Type: TABLE; Schema: static; Owner: postgres
--

CREATE TABLE client (
    id_cliente integer NOT NULL,
    nome_cliente character varying(45) NOT NULL
);


ALTER TABLE client OWNER TO postgres;

--
-- Name: projects; Type: TABLE; Schema: static; Owner: postgres
--

CREATE TABLE projects (
    id_progetto integer NOT NULL,
    nome_progetto character varying(45) NOT NULL,
    id_cliente integer
);


ALTER TABLE projects OWNER TO postgres;

--
-- Name: table_name_id_attivita_utente_seq; Type: SEQUENCE; Schema: static; Owner: postgres
--

CREATE SEQUENCE table_name_id_attivita_utente_seq
START WITH 1
INCREMENT BY 1
NO MINVALUE
NO MAXVALUE
CACHE 1;


ALTER TABLE table_name_id_attivita_utente_seq OWNER TO postgres;

--
-- Name: table_name_id_attivita_utente_seq; Type: SEQUENCE OWNED BY; Schema: static; Owner: postgres
--

ALTER SEQUENCE table_name_id_attivita_utente_seq OWNED BY attivita_utente.id_attivita_utente;


--
-- Name: employee; Type: TABLE; Schema: static; Owner: postgres
--

CREATE TABLE employee (
    id_utente integer NOT NULL,
    ore_di_lavoro integer NOT NULL,
    giorno integer NOT NULL,
    mese integer NOT NULL,
    anno integer NOT NULL,
    username_utente character varying(45) NOT NULL,
    password_utente character varying(45) NOT NULL
);


ALTER TABLE employee OWNER TO postgres;

--
-- Name: id_attivita_utente; Type: DEFAULT; Schema: static; Owner: postgres
--

ALTER TABLE ONLY attivita_utente ALTER COLUMN id_attivita_utente SET DEFAULT nextval('table_name_id_attivita_utente_seq'::regclass);


--
-- Data for Name: attivita; Type: TABLE DATA; Schema: static; Owner: postgres
--

COPY attivita (id_attivita, nome_attivita, id_progetto) FROM stdin;
\.


--
-- Data for Name: attivita_utente; Type: TABLE DATA; Schema: static; Owner: postgres
--

COPY attivita_utente (id_attivita_utente, id_utente, id_attivita) FROM stdin;
\.


--
-- Data for Name: client; Type: TABLE DATA; Schema: static; Owner: postgres
--

COPY client (id_cliente, nome_cliente) FROM stdin;
1	ThinkOpen
\.


--
-- Data for Name: projects; Type: TABLE DATA; Schema: static; Owner: postgres
--

COPY projects (id_progetto, nome_progetto, id_cliente) FROM stdin;
1	ThimeSheet	\N
\.


--
-- Name: table_name_id_attivita_utente_seq; Type: SEQUENCE SET; Schema: static; Owner: postgres
--

SELECT pg_catalog.setval('table_name_id_attivita_utente_seq', 1, false);


--
-- Data for Name: employee; Type: TABLE DATA; Schema: static; Owner: postgres
--

COPY employee (id_utente, ore_di_lavoro, giorno, mese, anno, username_utente, password_utente) FROM stdin;
\.


--
-- Name: attivita_id_attivita_pk; Type: CONSTRAINT; Schema: static; Owner: postgres
--

ALTER TABLE ONLY attivita
    ADD CONSTRAINT attivita_id_attivita_pk PRIMARY KEY (id_attivita);


--
-- Name: id_cliente; Type: CONSTRAINT; Schema: static; Owner: postgres
--

ALTER TABLE ONLY client
    ADD CONSTRAINT id_cliente PRIMARY KEY (id_cliente);


--
-- Name: id_progetto; Type: CONSTRAINT; Schema: static; Owner: postgres
--

ALTER TABLE ONLY projects
    ADD CONSTRAINT id_progetto PRIMARY KEY (id_progetto);


--
-- Name: id_utente; Type: CONSTRAINT; Schema: static; Owner: postgres
--

ALTER TABLE ONLY employee
    ADD CONSTRAINT id_utente PRIMARY KEY (id_utente);


--
-- Name: table_name_pkey; Type: CONSTRAINT; Schema: static; Owner: postgres
--

ALTER TABLE ONLY attivita_utente
    ADD CONSTRAINT table_name_pkey PRIMARY KEY (id_attivita_utente);


--
-- Name: table_name_id_attivita_utente_uindex; Type: INDEX; Schema: static; Owner: postgres
--

CREATE UNIQUE INDEX table_name_id_attivita_utente_uindex ON attivita_utente USING btree (id_attivita_utente);


--
-- Name: attivita_progetto_id_progetto_fk; Type: FK CONSTRAINT; Schema: static; Owner: postgres
--

ALTER TABLE ONLY attivita
    ADD CONSTRAINT attivita_progetto_id_progetto_fk FOREIGN KEY (id_progetto) REFERENCES projects(id_progetto) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: progetto_cliente_id_cliente_fk; Type: FK CONSTRAINT; Schema: static; Owner: postgres
--

ALTER TABLE ONLY projects
    ADD CONSTRAINT progetto_cliente_id_cliente_fk FOREIGN KEY (id_cliente) REFERENCES client(id_cliente) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: table_name_attivita_id_attivita_fk; Type: FK CONSTRAINT; Schema: static; Owner: postgres
--

ALTER TABLE ONLY attivita_utente
    ADD CONSTRAINT table_name_attivita_id_attivita_fk FOREIGN KEY (id_attivita) REFERENCES attivita(id_attivita) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: table_name_utente_id_utente_fk; Type: FK CONSTRAINT; Schema: static; Owner: postgres
--

ALTER TABLE ONLY attivita_utente
    ADD CONSTRAINT table_name_utente_id_utente_fk FOREIGN KEY (id_utente) REFERENCES employee(id_utente) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: static; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

