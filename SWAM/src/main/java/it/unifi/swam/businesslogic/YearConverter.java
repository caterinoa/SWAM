package it.unifi.swam.businesslogic;

import java.time.Year;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class YearConverter implements AttributeConverter<Year, Integer> {

	@Override
	public Integer convertToDatabaseColumn(Year year) {
		Integer dbYear = null;
		if (year != null) {
			dbYear = year.getValue();
		}
		return dbYear;
	}

	@Override
	public Year convertToEntityAttribute(Integer dbYear) {
		Year year = null;
		if(dbYear !=null) {
			year = Year.of(dbYear);
		}
		return year;
	}

}
