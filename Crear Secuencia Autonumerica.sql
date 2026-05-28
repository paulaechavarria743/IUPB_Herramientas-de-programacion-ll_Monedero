DO $$
DECLARE
    siguienteIdMoneda INTEGER;
    siguienteIdPais INTEGER;
    siguienteIdCambioMoneda INTEGER;
BEGIN
    -- Obtener el siguiente ID para cada tabla
    SELECT COALESCE(MAX(id), 0) + 1 INTO siguienteIdMoneda FROM moneda;
    SELECT COALESCE(MAX(id), 0) + 1 INTO siguienteIdCambioMoneda FROM cambiomoneda;
    SELECT COALESCE(MAX(id), 0) + 1 INTO siguienteIdPais FROM pais;

    -- Eliminar y recrear secuencia para Moneda
    EXECUTE 'DROP SEQUENCE IF EXISTS secuencia_moneda';
    EXECUTE format('CREATE SEQUENCE secuencia_moneda START %s INCREMENT 1', siguienteIdMoneda);

    -- Eliminar y recrear secuencia para País
    EXECUTE 'DROP SEQUENCE IF EXISTS secuencia_pais';
    EXECUTE format('CREATE SEQUENCE secuencia_pais START %s INCREMENT 1', siguienteIdPais);

    -- Eliminar y recrear secuencia para CambioMoneda
    EXECUTE 'DROP SEQUENCE IF EXISTS secuencia_cambiomoneda';
    EXECUTE format('CREATE SEQUENCE secuencia_cambiomoneda START %s INCREMENT 1', siguienteIdCambioMoneda);
END $$;
