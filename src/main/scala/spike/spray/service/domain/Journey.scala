package spike.spray.service.domain

import java.util.Date

case class Journey (
  id: Option[Long] = None,
  departureDate: Option[Date] = None,
  destinationCountry: Option[String] = None,
  countriesTransited: Option[TransitCountries] = None,
  dateOfArrival: Option[Date] = None
)
