-- function for get total country
CREATE OR REPLACE FUNCTION public.gettotalpaises()
	RETURNS int
AS $$
	declare totalPaises INT;
	begin	
	SELECT count(*)  FROM public.pais into totalPaises;
	return totalPaises;
	END;
$$ LANGUAGE plpgsql;

SELECT public.gettotalpaises();

