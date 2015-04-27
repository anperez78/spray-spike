package spike.spray.service.domain


case class TransitCountries (
  countryList: Option[Array[Map[String, Int]]] = None
  )