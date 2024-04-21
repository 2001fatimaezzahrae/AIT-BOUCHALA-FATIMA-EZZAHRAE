## Ait Bouchala Fatima Ezzahrae

## Activité Pratique N°2 - Spring Data JPA Hibernate

## Module:Systèmes Distribués

## Master SD FS MEKNES 2024



1. Installer IntelliJ Ultimate
2. Créer un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock
3. ona creer la classe Product:
4. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/9a11e2c1-c056-4946-ae0c-a3f8009fb663)
   

6. avec la base de donnees h2
7. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/1a1d9939-c2c5-4e4c-8ebb-7556eebc78e0)

8. 
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
######## La 1ere solution avec methode findBy
![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/92cb7e18-931c-43d3-b502-69a40688fe86)

####### 2eme méthode :
Il donne la même résultats :
![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/7c47c2c9-af1d-4052-bd42-f7b8f1ebd218)
####### Avec méthode traiter par prix :
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

on excute on aura comme suivant:

   ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/fbc81b47-7876-419f-9f58-56117e6d72b3)

   

10. Configurer l'unité de persistance dans le ficher application.properties
11. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/81f41502-3dc8-465f-a6a9-059095240a02)

12. 
13. Créer l'interface JPA Repository basée sur Spring data
14. ##### fichier pom.xml

15. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/496c9989-dbb8-480b-a7e2-d5548b3c12a9)

16. la classe role:
17. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/7b3ed16f-0039-4bab-b2f0-656f17cf2257)

18. la classe user:
19. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/5ed2699f-27b7-4af7-9890-bce028cfd433)
20. 

22. Tester quelques opérations de gestion de patients :
    - Ajouter des patients
    - Consulter tous les patients
    - Consulter un patient
    - Chercher des patients
    - Mettre à jour un patient 
    - supprimer un patient
   
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/32a55f16-4f20-4ad5-910a-549dbe2cd751)
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/9de8f332-e59b-4a7d-85f3-debff619f40a)
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/2b57b200-134d-41a0-9a94-8118bec502eb)
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/8abfbc20-221c-43ec-80cb-bfe083e2c3e9)
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/91147e58-d338-493b-ae9f-d979d72bc734)
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/7e4fdb42-f14b-457e-bdf4-18e998de2e74)
   
    - Apres exécution :
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/9a8adcd2-f2ca-482f-9f01-e492e3e00db6)
   
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/895a34d6-9fa3-4865-9319-e3efe6fb1b65)
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/00afdfd9-5263-488b-b290-5943773eaca5
    - ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/a986bad8-ae49-4c4b-b291-75d867dbc3c0)


23. Migrer de H2 Database vers MySQL
24. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/b72227b2-b5c2-4166-9400-7c1baa68b0be)
25. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/0386df61-ca6c-4cd7-9191-9e98914b0eef)

28. Reprendre les exemples  du Patient, Médecin, rendez-vous, consultation, users et roles de la vidéo :
29. la classe Patient
30. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/e2282bbb-10dc-4454-b448-4b4d43f185a4)

31. la classe RendezVous
32. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/10917ac7-d6f3-4e62-bbcc-0a276eab261f)

33. 
34. la classe Consultation
35. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/7f39379f-bc17-4def-ba7f-10aff51bcf6e)

36. 
37. la classe Medecin
38. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/887960c4-a08d-47c4-800b-07abb116b578)

39. enum statutRDV
40. 
41. 

42. 

