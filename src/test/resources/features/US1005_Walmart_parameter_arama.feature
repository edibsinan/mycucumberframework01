@walmart
  Feature: US1005_Walmart_parameter_arama
    Scenario Outline:
      When kullanici Walmart ana sayfaya gider
      Then walmart sayfasinda "<arananlar>" icin arama yapar
      Then walmartta sayfa basliginin "<arananlar>" icerdigini test eder
      And kullanici sayfayi kapatir

      Examples:
      |arananlar  |
      |Nutella    |
      |pencil     |
      |tomatoes   |
      |popcorn    |

