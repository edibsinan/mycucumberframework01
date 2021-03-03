@smoke
  Feature:
    Scenario: TC1008 kullanici gecerli bilgilerle giris yapar
      Given kullanici "Ck_Hotel_Url" anasayfaya gider
      Then  Log in yazisina tiklar
      And gecerli username girer
      And gecerli password girer
      And Login butonuna basar
      Then sayfaya giris yaptigini kontrol eder
      And kullanici sayfayi kapatir