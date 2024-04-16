## Activité Pratique N° 1- Injection des dépendances

## Module:Systèmes Distribués

## Master SD FS MEKNES 2024

## Ait Bouchala Fatima Ezzahrae

### Invertion de contrôle :
le concept Invertion de contrôle permet au programmeur de  se concentrer sur les aspects fonctionnels  et les Framework pour les aspects techniques .

-->Si une classe dépende d’autre classe donc on parle sur couplage fort.

-->Si une classe qui dépende  ou implémente une interface donc on est dans le couplage faible. donc le but est de creer une aaplication fermée a modification est ouvert  a extension. 


1. Créer l'interface IDao avec une méthode getDate
2. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/a40e2811-1145-4bc5-b555-a7b5c5f45b45)

3. Créer une implémentation de cette interface
4. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/dae323d1-1c5c-4797-a1eb-f58d2288e075)

5. Créer l'interface IMetier avec une méthode calcul
6. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/5901bd0c-d237-4971-a2d4-65ae892d198f)

7. Créer une implémentation de cette interface en utilisant le couplage faible
8. ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/df5cf76d-50c0-4ea3-a304-d7c29e7961b1)

9. Faire l'injection des dépendances :
    
  a. Par instanciation statique
![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/29da8090-c68a-4cb7-b77e-945a6577e040)
![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/654e0350-3c5a-4e72-a2ef-68c979286eb1)
![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/00c67b11-c404-422e-9e77-2c218617a2ec)


### la version  web service
![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/0ae05f4d-4105-4e26-b279-34f7a7418fd9)


  b. Par instanciation dynamique
  
  ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/7e080e13-23f6-4b1d-b18f-9ba824ed470d)
  ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/ab9456e1-509e-423e-8ff4-c96df6c079cb)


  c. En utilisant le Framework Spring
  
       - Version XML

              
  #### le fichier Pom.xml
  ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/7516d29e-6e02-4f97-b846-14f74e593b9b)

  
  ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/8ed01846-c7cb-4f39-b68b-6a22a3e079ea)
  ![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/f1cf1878-6538-4d94-8dca-e460c36f3efd)
  
#### la version web service 
![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/80b8bf4c-1ec5-4a40-8e3c-c0f72d8c8016)


- Version annotations
  
![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/48a3456f-e2bb-40a6-8619-67a23ea5f76b)

par constructeur:

![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/78787429-66f5-438c-8d66-5b85a40aebf8)
![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/9b8fdd10-8250-4679-a6cf-bc0ffca2ad4f)

####Les commande de base en Intellij

![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/078cd3e3-9a3f-440d-a1be-8237093b6d3e)



#### le Test unitaire :

![image](https://github.com/2001fatimaezzahrae/AIT-BOUCHALA-FATIMA-EZZAHRAE/assets/152180866/2d779444-398e-4c21-b0a2-44aa2db29598)


 







      
    




       


