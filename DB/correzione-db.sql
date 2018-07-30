ALTER TABLE public.attivita DROP CONSTRAINT id_utente;
DROP INDEX public.fki_id_utente RESTRICT;
ALTER TABLE public.attivita DROP id_utente;

ALTER TABLE public.attivita DROP CONSTRAINT id_attivita;
DROP INDEX public.fki_id_attivita RESTRICT;
ALTER TABLE public.employee DROP id_attivita;

DROP INDEX public.fki_id_progetto RESTRICT;
ALTER TABLE public.client DROP id_progetto;

ALTER TABLE public.projects DROP id_attivita;