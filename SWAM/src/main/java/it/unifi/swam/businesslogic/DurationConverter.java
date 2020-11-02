package it.unifi.swam.businesslogic;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class DurationConverter implements AttributeConverter<Duration, Long> {

	@Override
	public Long convertToDatabaseColumn(Duration duration) {
		Long dbDuration = null;
		if (duration != null) {
			dbDuration = duration.toMinutes();
		}
		return dbDuration;
	}

	@Override
	public Duration convertToEntityAttribute(Long dbDuration) {
		Duration duration = null;
		if (dbDuration != null) {
			duration = Duration.of(dbDuration, ChronoUnit.MINUTES);
		}
		return duration;
	}

}
