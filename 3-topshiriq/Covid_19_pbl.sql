CREATE DATABASE Covid_19_pbl;
USE Covid_19_pbl;

CREATE TABLE fuqaro_malumotlari(
	 passport_seriya VARCHAR(15) NOT NULL,
	 ism varchar(50) NOT NULL,
	 familya VARCHAR(50) NOT NULL,
     sharifi VARCHAR(50) NOT NULL,
     jinsi VARCHAR(10) NOT NULL,
	 tugulgan_yili DATE NOT NULL,
     yashash_manzili VARCHAR(255) NOT NULL,
     PRIMARY KEY(passport_seriya)
);

CREATE TABLE vaksina(
	id INT NOT NULL AUTO_INCREMENT,
    nomi VARCHAR(50) NOT NULL,
    mavjud_soni INT NOT NULL,
    qabul_qilish_soni INT NOT NULL,
    malumotlari VARCHAR(255) NOT NULL,
    oraliq_kuni INT NOT NULL,
    PRIMARY KEY(id)
);
    
CREATE TABLE Xodimlar(
    login VARCHAR(255) NOT NULL,
    parol VARCHAR(255) NOT NULL,
	ism varchar(50) NOT NULL,
	familya VARCHAR(50) NOT NULL,
	tugulgan_yili DATE NOT NULL,
    lavozimi VARCHAR(50) NOT NULL,
	malakasi VARCHAR(50) NOT NULL,
    PRIMARY KEY(parol)
);    
CREATE TABLE vaksina_jarayoni(
	id INT NOT NULL AUTO_INCREMENT, 
	fuqaro_seriya VARCHAR(15) NOT NULL,
    vaksina_nomi  VARCHAR(255) NOT NULL,
    xodim VARCHAR(255) NOT NULL,
    belgilangan_sana_vaqt date not null,
    hozirgi_sana_vaqt date NOT NULL,
    FOREIGN KEY (fuqaro_seriya) REFERENCES fuqaro_malumotlari(passport_seriya),
    FOREIGN KEY(xodim) REFERENCES Xodimlar(parol),
    PRIMARY KEY(id)
);

INSERT INTO fuqaro_malumotlari(passport_seriya,ism,familya,sharifi,jinsi,tugulgan_yili,yashash_manzili)
VALUES('AC0537540','Humoyun','Saydullayev','Dilshod ogli','Erkak','2002-04-15','Jizzax viloyati Gallaorol tumani '),
	  ('AB9469170','Mirabzal','Miryusupov','Mirmaxsud ogli','Erkak','2002-04-25','Toshkent shahar Yunusobod tumani '),
      ('AC0250358','Azizxoja','Husanov','Odilxoja ogli','Erkak','2002-08-18','Toshkent shahar Olmozor tumani'),
      ('AB9947539','Dilnoza','Ziyodullayeva','Alisher qizi','Ayol','2002-06-07','Toshkent viloyati Zangiotra tumani'),
      ('AB4740025','Bahodir','Isobayev','Baxtiyor ogli','Erkak','1998-06-03','Namangan viloyati  Namangan shahri'),
      ('AB7748977','Oybek','Malikov','Bahodir ogli','Erkak','2002-12-04','Samarqand viloyati Qoshraobod tumani'),
      ('AC1473870','Rustam','Fozilov','Gayrat ogli','Erkak','2002-10-25','Toshkent shahar Chilonzor tumani'),
      ('AC1668359','Azamjon','Yusupov','Shokir ogli','Erkak','2002-02-06','Toshkent viloyati Ortachirchiq tumani'),
	  ('AB2248734','Dilshodbek','Abduraxmanov','Muzaffar ogli','Erkak','1998-03-08','Qashqadaryo viloyati  Qarshi shahri'),
      ('AB7485676','Fayzullo','Rahmatullayev','Hamidullo ogli','Erkak','1998-02-04','Namangan viloyati  Uychi tumani'),
      ('AB4731481','Ogabek','Komilov','Otabekovich','Erkak','1998-02-21','Xorazm viloyati  Xiva tumani'),
      ('AA0142384','Arofat','Babaniyazova','Saatbay qizi','Ayol','1996-04-27','Toshlent shahar Xamza tumani'),
      ('AB7557310','Ezoza','Saydullayeva','Zokirjon qizi','Ayol','2001-08-16','Toshkent viloyati Bekobod tumani '),
      ('KA1238001','Shohruh','Orinboyev','Fayzullo ogli','Erkak','2002-07-23','Qoraqolpogiston respublikasi Amudaryo tumani ');
SELECT * FROM fuqaro_malumotlari;

INSERT INTO vaksina(nomi,mavjud_soni,qabul_qilish_soni,malumotlari,oraliq_kuni)
VALUES('Xitoy Ozbekiston',100,3,'Xitoy va Ozbekiston olimlari tomonidan Coronavirus infeksiyasiga qarshi ishlab samarali vaksina turi',28 ),
      ('Sputnik V',100,2,'Rossiya olimlari tomonidan Coronavirus infeksiyasiga qarshi samarali va eng birinchi ishlab chiqilganivaksina turi',28),
      ('AStraZeneca',100,2,'Germaniya olimlari tomonidan Coronavirus infeksiyasiga qarshi ishlab samarali vaksina turi',28),
      ('Moderna',100,2,'Amerika Qoshma shtatlari olimlari tomonidan Coronavirus infeksiyasiga qarshi ishlab samarali vaksina turi',28),
	  ('Pfizer',100,2,'Buyuk Biritaniya olimlari tomonidan Corona-virus infeksiyasiga qarshi ishlab samarali vaksina turi',28);
SELECT * FROM vaksina;

INSERT INTO Xodimlar(login,parol,ism,familya,tugulgan_yili,lavozimi,malakasi)
VALUES('Dilfuza','Dilfuza1981','Dilfuza','Mamanazarova','1981-03-22','Hamshira','Oliy'),
	  ('Shoira','Shoira1983','Shoira','Abdullayeva','1983-12-31','Hamshira','1-toifali'),
      ('Muhammad','Muhammad1994','Muhammad','Osimov','1994-11-21','Emlovchi shifokor','1-toifali'),
      ('Shohruh','Shohruh1992','Shohruh','Orinboyev','1992-11-21','Emlovchi shifokor','Oliy');

insert into vaksina_jarayoni(fuqaro_seriya,vaksina_nomi,xodim,belgilangan_sana_vaqt,hozirgi_sana_vaqt)
values('AC0537540','Xitoy Ozbekiston','Shohruh1992','2022-01-06','2022-01-01'),
      ('AC0537540','Xitoy Ozbekiston','Shohruh1992','2022-01-06','2022-01-01'),
      ('KA1238001','Xitoy Ozbekiston','Shohruh1992','2022-01-06','2022-01-01'),
      ('AA0142384','Xitoy Ozbekiston','Shohruh1992','2022-01-06','2022-01-01'),
      ('AA0142384','Xitoy Ozbekiston','Shohruh1992','2022-01-06','2022-01-01'),
      ('AA0142384','Xitoy Ozbekiston','Shohruh1992','2022-01-06','2022-01-01');

select fuqaro_malumotlari.passport_seriya,fuqaro_malumotlari.ism,fuqaro_malumotlari.familya,	
vaksina_jarayoni.vaksina_nomi,Xodimlar.ism,Xodimlar.familya,vaksina_jarayoni.belgilangan_sana_vaqt,vaksina_jarayoni.hozirgi_sana_vaqt
from vaksina_jarayoni
inner join fuqaro_malumotlari on vaksina_jarayoni.fuqaro_seriya=fuqaro_malumotlari.passport_seriya
inner join Xodimlar on vaksina_jarayoni.xodim=Xodimlar.parol;
delete from vaksina where nomi='Xitoy Ozbekiston';