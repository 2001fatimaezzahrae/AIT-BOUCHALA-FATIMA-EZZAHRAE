## Ait Bouchala Fatima Ezzahrae

## Activité Pratique N°2 - Spring Data JPA Hibernate

## Module:Systèmes Distribués

## Master SD FS MEKNES 20243




1. Installer IntelliJ Ultimate
2. Créer un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock
3. ona creer la classe Product:
4. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/9a11e2c1-c056-4946-ae0c-a3f8009fb663)
   

6. avec la base de donnees h2
8. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/1a1d9939-c2c5-4e4c-8ebb-7556eebc78e0)


![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/de99ed48-4e56-4e10-8fb0-a35906ec3908)

#### Pour utiliser base de donnes mySQl : 

Ici on a ajouter les dependances de mySql

![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/8677d99e-7ab6-4b86-84f6-a9a35870cdee)


On execute application on aura les resultats suivants :

Et on obtient dans php myAdmin

![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/4616b810-9c4c-4b7f-97d1-561a2e574b0c)

Si on exécute une autre fois on obtient le suivant :

![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/219efa44-e4aa-4b81-8d95-eb8a1c6295f8)


#### Autres méthodes :

###### La 1ere solution avec methode findBy

![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/92cb7e18-931c-43d3-b502-69a40688fe86)

###### 2eme méthode :

Il donne les même résultats :

![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/7c47c2c9-af1d-4052-bd42-f7b8f1ebd218)

la méthode traiter par prix :

![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/ef401859-fd48-40d3-988d-28deca1497b3)

![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/6ff9cf1d-3e91-4871-bf9e-c099349e0c64)

on aura les resultats suivants:

![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/7f78ffc0-91fa-4cfb-be1f-dc5943de9bc3)


###### Web service  :

![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/537517e4-fcbb-46ff-8963-25766833ece3)


8. Créer l'entité JPA Patient ayant les attributs :
 
       - id de type Long
   
       - nom de type String
   
       - dateNaissanec de type Date
   
       - malade de type boolean
   
       - score de type int
   
   ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/f27fbc78-44fd-412c-93df-19961716174d)


   la classe RendezVous
   
32. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/10917ac7-d6f3-4e62-bbcc-0a276eab261f)

    
 la classe Consultation
 
36. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/7f39379f-bc17-4def-ba7f-10aff51bcf6e)

   
 la classe Medecin
 
40. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/887960c4-a08d-47c4-800b-07abb116b578)

 enum statutRDV
 
43. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/bfd91b3a-baa8-4676-a0db-77acf2680d8e)


   

10. Configurer l'unité de persistance dans le ficher application.properties
 
12. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/799236ec-bb40-4c49-8a5a-ff8bd0a14106)


 
14. Créer l'interface JPA Repository basée sur Spring data
    
16. ##### fichier pom.xml
 
18. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/6c15cab7-0d9b-4461-9799-0c9215a96dce)
    
20. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/f205c880-f7e1-4e2b-ab94-571cd8db0953)
    
22. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/b5ee6061-41fe-427d-ad69-e558ab68368f)
 
24. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/908f1f64-9e2c-4140-86bc-836253389b37)
 
26. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/b860d05e-e8c9-422a-a9e0-e6e3ec0ea0b4)

27. la classe UserController:
   ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/04d95d40-fdaa-4e60-a676-5abeff240115)

 




29. Tester quelques opérations de gestion de patients :
    - Ajouter des patients
    - Consulter tous les patients
    - Consulter un patient
    - Chercher des patients
    - Mettre à jour un patient 
    - supprimer un patient
   
30. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/b1998612-36ed-4e3c-94ab-08525ac3a3e9)
    
32. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/acaeebf3-59a3-4938-a222-291e2f4b2ee3)
 
34. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/b9d18d89-020e-4323-8cf7-a5f692af02fd)



35. on excute on aura comme suivant:

   ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/fbc81b47-7876-419f-9f58-56117e6d72b3)
   
   ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/3f57119d-c9af-4f78-9f36-2c264d807354)
   
   ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/67fae4d3-f303-4661-ac66-b1f2a90460ae)
   
   ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/e17710c4-efdf-493a-a3dd-b847368f7235)
   
   ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/94a59cee-b293-4038-980b-1875098396e2)


   La listes des patients :

   ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/4e2da5a6-a8ff-43e6-ac9b-70f3b1bad835)



   
   
25. Migrer de H2 Database vers MySQL
 
27. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/b72227b2-b5c2-4166-9400-7c1baa68b0be)
    

30. Reprendre les exemples  du Patient, Médecin, rendez-vous, consultation, users et roles de la vidéo :


42.  ##### fichier pom.xml

15. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/496c9989-dbb8-480b-a7e2-d5548b3c12a9)

16. la classe role:
    
18. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/7b3ed16f-0039-4bab-b2f0-656f17cf2257)

19. la classe user:
 
21. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/5ed2699f-27b7-4af7-9890-bce028cfd433)
 


    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/32a55f16-4f20-4ad5-910a-549dbe2cd751)
    - 
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/9de8f332-e59b-4a7d-85f3-debff619f40a)
    - 
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/2b57b200-134d-41a0-9a94-8118bec502eb)
    - 
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/8abfbc20-221c-43ec-80cb-bfe083e2c3e9)
    - 
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/91147e58-d338-493b-ae9f-d979d72bc734)
    - 
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/7e4fdb42-f14b-457e-bdf4-18e998de2e74)
   
    - La partie web :
   
    -  la classe UserController:
       ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/a9647260-8d20-4737-b336-a717d4ed604c)
   
    - Apres exécution :
    - 
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/9a8adcd2-f2ca-482f-9f01-e492e3e00db6)
   
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/895a34d6-9fa3-4865-9319-e3efe6fb1b65)
    - 
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/00afdfd9-5263-488b-b290-5943773eaca5)
    - 
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/a986bad8-ae49-4c4b-b291-75d867dbc3c0)

