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

####Pour utiliser base de donnes mySQl : 
Ici on a ajouter les dependances de mySql

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
      ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/c8cb05f9-734f-4e3c-8f24-a2b61692008d)
   


10. Configurer l'unité de persistance dans le ficher application.properties
11. 
12. Créer l'interface JPA Repository basée sur Spring data
13. 14. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/3b5fe733-6294-441d-b8c6-c1989a37054b)
15. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/0e1fb39d-e482-472e-8f81-723cb13d0d94)
16. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/649f9530-b8aa-48d1-9216-c212bbad5d9d)
    ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/9e89dd4a-8659-4bad-b75c-5b7524465b1e)
![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/600fbe2b-a5a7-46d5-b7e3-7151beec711f)





        




22. Tester quelques opérations de gestion de patients :
    - Ajouter des patients
    - Consulter tous les patients
    - Consulter un patient
    - Chercher des patients
    - Mettre à jour un patient 
    - supprimer un patient
23. Migrer de H2 Database vers MySQL
24. Reprendre les exemples  du Patient, Médecin, rendez-vous, consultation, users et roles de la vidéo : 
