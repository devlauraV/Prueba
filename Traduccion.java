
<includeonly>=</includeonly>==Version record==<includeonly>=</includeonly>
{| class="wikitable" style="margin: auto;"
|-
! style="background:#e9e9e9; text-align:center;"|Version
! style="background:#e9e9e9; text-align:center;"|Launch date 
! style="background:#e9e9e9; text-align:center;"|Description
|- valign="center"
| 0
| 07/05/2019
|
* Preview version.
|-
| 1.0
| 14/06/2019
|
* Initial version.
* "Technical annex V1.4 (19-04-19)" DIAN reference.
|-
| 1.1
| 04/07/2019
|
* "Sale electronic bill Technical annex – final" DIAN Reference update.
|-
| 1.2
| 04/07/2019
|
* Minor updates
|-
| 1.3
| 19/08/19
|
* Minor updates
|-
| 1.4
| 23/08/19
|
* Answer update in view of the send method.
* List of extensible fields and bug catalog.
|-
| 1.5
| 09/2019
|
* Wildcards updates based on the September 6th- technical annex.
|-
| 1.6
| 04/2020
|
* Updates based on the technical annex 1.8.
* Acknowledgment of the purchaser.
* Mail personalization.
* Additional features.
* Settle documents at reception.
* Code  tables.
* Change of the document's name.
* Among other minor changes.
|-
| 1.7
| 06/2020
|
* Updates based on the technical annex V1.7-2020. 
* Ajustes de funcionalidades de la plataforma en el mes de mayo.
|-
| 2.0
| 06/2021
|
* Updates based on the technical annex V1.8 of the 000012 Resolution. Health sector fields. Code  tables.
|-
| 2.1
| 10/2021
|
* Updates based on the technical annex V1.8 of the 000012 Resolution. Health sector fields. Code  tables.
|-
|}

<includeonly>=</includeonly>==How to get support?==<includeonly>=</includeonly>
*First level support: 
::Phone support / e-mail / chat or teleconference in 5x8 schedule for consultation service and user failures.
*Second level support:
::Support remote resolution of incidents in the system in schedule 5X8
::::Write to [mailto:soporte@thefactoryhka.com.co soporte@thefactoryhka.com.co]

Consultations relating to configurations and errors in the portal:
* soporte_fel_co@thefactoryhka.com

Consultations relating to configurations of ERP, software house and integration:
* integracion_fel_co@thefactoryhka.com


'''Telephone service lines:'''
* '''MASTER''' +57 (1) 746.08.12
*        +57 (1) 508.8990
*        +57 (1) 517.6795
*        +57 (1) 517.6796
*        +57 (1) 311.3063
** '''Technical support''' → Option 2
** '''Integration ''' → Option 5 Then Option 1

<includeonly>=</includeonly>===Synchronous sessions:===<includeonly>=</includeonly>

<includeonly>=</includeonly>====Technical support session====<includeonly>=</includeonly>
Registration as an electronic biller, configuration of numbering ranges, fiscal data configuration, Enabling Tests, Production environment configuration, managment and use of the TFHKA electronic billing portal. 

'''Addressed to:''' Comercial agencies – Ally software factories -  Final clients

'''Schedule:'''  Tuesday and thursday  from 8:30 AM to 10:00 AM

[https://meet.google.com/yyg-pujr-yqv Enlace Sesiones de Soporte]


<includeonly>=</includeonly>====Integration area sessions<includeonly>=</includeonly>====
Solución integration cases

'''Addressed to:''' Clients that realice Software development to do integration with TFHKA, Ally software factories

'''Schedule:''' Tuesday and thursday  from 8:30 AM to 10:00 AM

[http://meet.google.com/fzo-xmyc-duk Enlace Sesiones Integración]
{{clear}}
<includeonly>=</includeonly>== General description==<includeonly>=</includeonly>
This document describes the integration process between the electronic invoicing model with prior validation according to regulatory and technical updates from the DIAN and/or own controls in our integration model.

For the development of this document, was taken as reference the  '''Technical annexes V1.7-2020 (current) and V1.8 (this last released in October 2019 by the DIAN)'''.

'''Note:'''  Not all functionalities, catalogs and billing scenarios referring to the Technical Annex V1.8 are enabled by the DIAN.
{{clear}}
===What is The Factory HKA-DFACTURE?===
It is an electronic billing platform, designed to comply with current legislation in Colombia and offer added values through complementary services.
===What is The Factory HKA-Dfactura?===
It is a portal with the capacity to issue documents under the electronic invoicing scheme, managed from the web portal and Addressed to taxpayers who have the obligation to issue electronic invoices by resolution of the DIAN.
===What is Dintegración?===
It is a product aimed at the integrator and is made up of the following components:
*Integration manuals.
*Bag of support hours via email and/or teleconferences.
*Credentials for test environment (DEMO) and production. 
*Configurable Templates for graphical representation.
{{clear}}
===Functionalities===
The Factory HKA-DFACTURE platform allows the issuance, reception, consultation, viewing and downloading of the following documents in XML format and/or their corresponding graphic representation in PDF:
*Invoice of National Sale
*Export invoice
*Contingency invoice	
*Credit note
*Debit note
Additionally, the platform allows you to check the status of the Acknowledgment of Receipt by the purchaser, the status of the document by the DIAN, check the number of available stamps/folios and send receipts via email.

'''@Important:''' It is only possible to view or download graphic representations (PDF of electronic documents) generated by our platform on our web portal.
{{clear}}
===The direct integration===
Direct integration is a unique process between the embedded software and The Factory HKA-DFACTURE platform.Integration is an essential activity for the implementation of electronic invoicing in a Billing System or Administrative Software (ERP) and will be carried out only once. This activity consists of linking two platforms with different technologies in order to transmit the necessary data for the construction of the documents and the successful monitoring of the life cycle

In the case of direct integration, the communication is connected directly to the Web Service, which has the advantage of total control of the life cycle of the electronic document, from the origin of the data, through the transmission process to its delivery, acknowledgment of receipt and validation. This form of integration allows a faster and more efficient reaction to errors or inconsistencies that arise in the process.

Direct integration is an exclusive process between the embedded software and The Factory HKA-DFACTURE platform.

'''@Important:''' It is not necessary to implement additional integration with the DIAN, since it has the complete document status tracking functionality. 
{{clear}}
===Technical requirements for direct integration===
The Factory HKA-DFACTURE is a SaaS (Software as a Service) type platform: The services, information, processing, inputs and results are hosted on our servers (as technology provider), and we take care of the maintenance, operation, regulatory changes and solution support.

By DIAN regulations, the technology provider has the obligation to keep the documents and guarantee the integrity and security of the data under the ISO 27001 standard. Therefore, extensive planning of processing and storage infrastructure is not necessary to implement electronic billing.

The necessary parameters for the construction of each transaction are exposed independently at the time of consuming the services, and the result is fully delivered at the end of the operation. This means that The Factory HKA does not require managing customer or product/service databases.
As a technological provider, The Factory HKA Colombia has human resources dedicated to monitoring and analyzing the regulatory changes that the DIAN progressively issues. If a significant change is generated that has an impact on the integration side, the necessary tools and instructions will be provided to apply the corrective measures in the simplest way possible.

The Factory HKA-DFACTURE platform provides integration with a Web Service as a solution for interoperation with third parties. '''The Web Service is developed in SOAP (Simple Object Access Protocol)'''. Therefore, the only requirements for integration will be the following:

*Capacity of WS SOAP consumption of the software (development environment) to use.
*Capability of capturing and validating input data.
*Optional: Ability to store a copy of the XML/PDF per transaction.
*Ability to display the status of the electronic document life cycle.
{{clear}}
<includeonly>=</includeonly>==Electronic invoice operation scheme with prior validation==<includeonly>=</includeonly>
===What is the electronic invoice with prior validation?===
Electronic Invoicing (FEL) is an operation scheme that allows the issuance of supporting documents for commercial operations between taxpayers in digital format instead of paper, allows the application of fiscal control during the process, and has legal validity for the designated tax entity. by the government of the country.

As of September 2019, it is expected that an electronic invoice will only be valid when its content has been previously validated through the DIAN or through a provider authorized by the tax administration.

Prior validation is established in Law 1943 of 2018, known as the Financing Law. Article 16 of this Law modifies article 616-1 of the Tax Statute, in its first paragraph it establishes that:

“All electronic invoices for tax recognition must be validated prior to their issuance, by the DIAN or by a provider authorized by it. The electronic invoice will only be understood as issued when it is valid and delivered to the purchaser. (…)”

In the electronic invoicing model with prior validation, 5 types of documents will be used:
*Invoice 
*CreditNote  
*DebitNote 
*ApplicationResponse (Event): Occurrence related to an Electronic Document, generated by a person or entity related to the document (DIAN, Issuer, Acquirer), this document also contains an electronic signature. 
*AttachedDocument (Document container): The structure of this document is intended to contain in a single XML file an electronic document (Invoice, CreditNote or DebitNote) and all the events (ApplicationResponse) registered to date.
{{clear}}
===Who participates in this scheme?===
'''The Tax Entity (DIAN):''' It is a public institution appointed by the government to collect, control and regulate everything related to taxes. It is the one that has the right to accept and authorize an electronic document. In Colombia, it is the DIAN (Directorate of National Taxes and Customs).

'''The Issuer or Taxpayer:''' Is a natural or legal person who has a unique and legal tax information record before the tax entity (NIT: Tax Identification Number) and is under the obligation to issue documents to support their business transactions. The issuer acquires the Billing System or ERP administrative software to simplify and enhance its work and uses it to interact with the electronic billing platform.

'''The Technological Provider:''' It is a private entity authorized by the DIAN to provide services related to the Electronic Invoicing scheme: XML construction, sequential control, signing, regulatory change control, processing, storage and consultation. The Factory HKA Colombia is your technology provider.

'''The Purchaser:''' Is the person who gives rise to a commercial transaction through the purchase of a product or service, and who finally chooses to receive his electronic document via email.

'''The Certification Authority:''' It is a public or private entity authorized by the Tax Entity to issue electronic certificates in accordance with the law and associated regulations. In Colombia, there are several authorities accredited to issue electronic certificates for electronic invoicing, including ANDES SCD.
{{clear}}
===Advantages of Electronic Billing===
The Electronic Billing scheme is advantageous because it is:
*Full: Guarantees that the information contained is protected and cannot be altered.
*Authentic: Allows you to verify the identity of the issuer of the document.
*Legal: This scheme is implemented and accepted under the framework of the Law.
*Convenient: Eliminates infrastructure for physical media handling, shipping, and storage, and enables printing.
*Eficiente: It is 100% based on an electronic platform, which makes handling, sending, searching and storing faster and more practical.
{{clear}}
===Electronic Billing Process with Prior Validation===
 
#The Acquirer originates a transaction through the purchase of a product or service.
#The Issuer or Taxpayer loads the data through the UI (User Interface) of its ERP.
#The Issuer or Taxpayer displays the available stamps in the UI of their ERP.
#The ERP builds the object and exposes it directly to the DFACTURE platform through the corresponding method of the Web Service.
#The Factory HKA platform – DFACTURE.
#*Validates the Taxpayer's access credentials.
#*It validates the structure of the object that the ERP sends.
#*Validates the content of the object sent by the ERP.
#*Assigns the CUFE (Unique Code of Electronic Invoice) to the document.
#*It builds the XML of the document according to the DIAN regulations.
#*Sign the document with the Digital Certificate of the Taxpayer.
#*Optional: Generate a printed representation in PDF according to DIAN regulations.
#*Stores information in Database (Conservation).
#*It sends the XML to the DIAN for validation.
#*Wait for response from DIAN with validation result.
#*Send the XML and PDF to the email provided by the Purchaser.
#*It responds to the request from the ERP indicating that the operation was successful.
#Optionally, the ERP can send the XML and PDF to the purchaser.
#Optionally, the ERP can download the XML and PDF files for internal purposes.
#The Purchaser receives the XML and the PDF (via email).
#The Acquirer has up to 72 hours to give Acknowledgment of Receipt of the document, after which it will be considered a tacit acceptance (this process has not yet been fully defined by the DIAN).
#The Issuer or Taxpayer displays the status of the acknowledgment of receipt of the Acquirer in the UI of their ERP.


; Electronic Billing Process with Prior Validation
[[Archivo:Proceso de Facturación Electrónica con Validación PreviaDIAN.png|Proceso de Facturación Electrónica con Validación Previa (Fuente: DIAN)]]

'''@Important:''' For development environments with limitations to consume SOAP Web Services directly, The Factory HKA Colombia makes APIs available, simplifying this process for the integrator.
{{clear}}

<includeonly>=</includeonly>==Process characteristics with Prior Validation==<includeonly>=</includeonly>
#In an initial stage, for a single time, the issuer must register and the platform must be configured directly from The Factory HKA-Dinvoice portal.
#The platform operates under a commercial model of stamps or folios. The stamps correspond to a package of operations that the taxpayer contracts under a commercial agreement with The Factory HKA Colombia, and entitles him to a certain number of transactions. The ERP can consult the Web Service of THE FACTORY HKA – DFACTURE for the available stamps.
#For the document to be considered an electronic invoice, DIAN validation is required for its subsequent sending to the Acquirer by Dfactura.
#In the event that the document is not successfully valid before the DIAN, it must be corrected and reissued.
#The ERP can consume the Web Service to download XML and PDF if you want an alternative backup or offer offline query functionality.
#The ERP can optionally decide whether to send the XML and PDF to the Acquirer under its structure.
#The platform's Web Service offers the functionality of querying the Acknowledgment of Receipt status by the Acquirer. It is updated asynchronously.
#The Web Service of the platform offers the function of querying the status of the document by the DIAN. It is updated asynchronously.
#The ERP reflects in its UI the results of your queries and operations with the platform. However, the Issuer or Taxpayer can monitor or review their ERP by accessing The Factory HKA-Dfactura portal, since the operations carried out in the Web Service are reflected in the portal.

; Diagram of components and dependencies of the electronic billing system
[[Archivo:DIAGRAMA COMPONENTES.png|centro|DIAGRAMA COMPONENTES]]

The figure above shows the way in which the Billing Software (ERP) integrates and makes use of the electronic billing functionalities of The Factory HKA – DFACTURE platform, interacting with external elements (the issuer, the Acquirer and the DIAN) through the available dependencies, you can see the functions that each system must perform.
{{clear}}

<includeonly>=</includeonly>==Information security: recommendations on the implementation of electronic invoicing within the issuer's network and systems==<includeonly>=</includeonly>
This section provides recommendations on the implementation and integration of Electronic Invoicing in your organization and on the configuration of your Systems and networks to mitigate the risks of improper access to data by external parties to your organization.
===In General:===
# Have antivirus in your company.
# Have frequent backup policies and procedures, carried out in a period of execution that is consistent with the criticality of the business. To do this, take the following aspects into account:
#* Restoration tests should be performed..
#* They must be in an infrastructure other than the operating one (in the event of ransomware, all the accessed infrastructure will be compromised)
# If possible, look for security consultants and specialists and carry out ISO 27001:2013 audits to assess the quality of the decisions made in the implementation of electronic invoicing in your company.
# Avoid the use of generic users and/or Administrators in the organization and apply to each user the access control, permissions and roles that correspond to them according to their function. 
===Individuals with The Factory HKA Colombia SAS:===
#Only allow access to TCP/UDP ports 80 and 443 to the domains indicated below:
#**.thefactoryhka.com.co
#*emisionrest21.thefactoryhka.com.co (Integration – Production)
#*invoice21.thefactoryhka.com.co (Portal – Production)
#*demoemisionrest21.thefactoryhka.com.co (Integration –Demo)
#*demofactura.thefactoryhka.com.co (Portal – Demo)
#Open access to these TCP/UDP ports to the entire internet is not recommended.
#In the electronic invoice model with The Factory HKA Colombia SAS, the requests arise from the client only, so they can establish rules from external connection attempts. (The communication will always be initiated by the client software.)
#If The Factory HKA Colombia SAS client software tools are used, such as:
#*intTFHKAFEL21.exe
#*AutoFact.exe
#:And they are seen as a risk by the antivirus system or client protection, an exception must be generated in the firewall, antivirus, and any other protection system solely and exclusively for them.
#The Company TOKEN and production TOKEN Password for the Electronic Invoicing Platform of The Factory HKA Colombia SAS must be kept confidential and only be accessible by trusted personnel.
#In the event that the issuer contracts a graphic representation service with the software house, or developer, in charge of making the corresponding adjustments in the accounting software or ERP for the issuance of electronic documents, the following aspects must be taken into account:
#*The Factory HKA is responsible for the generation of the UBL and its transmission to the DIAN.
#*Once the correct validation and generation of the UBL is verified, the software house can proceed to generate a graphic representation that must comply with:
#::The elements of law required by the DIAN: inclusion of the QR code and the CUFE or CUDE chain in the documents, as appropriate.
#::The elements of law required by any supervisory entity from the issuer of the documents.
#::The visual and brand representation elements required by the client: logos, banking information, legends referring to the tax responsibilities of the issuer, etc.
#*The Software House, in this scenario, assumes responsibility together with the taxpayer for any incident of fraud due to evasion, misinterpretation, error or omission of relevant and mandatory information by the regulations.
#:TFHKA does not protect this representation in its systems and makes it clear that its participation as a technology provider is limited to the generation of the UBL and its validation to the DIAN.
{{clear}}

<includeonly>=</includeonly>==Web services soap with prior validation==<includeonly>=</includeonly>
To consume the methods of the Web Service, it is essential to use the access credentials, made up of a Company Token and a Password Token., To consume the methods of the Web Service, the use of access credentials, made up of a Company Token and a Password Token, is essential. It will also be necessary to know the URL's of the Web Services of the integration environment with prior validation., It will also be necessary to know the URLs of the Web Services of the integration environment with previous validation. These elements will be provided by The Factory HKA Colombia Integration team.
'''@Important:''' This document refers to the integration process with prior validation, its technical and regulatory change controls and its differences with the web service with subsequent validation.

Below are the methods that will be available in THE FACTORY HKA-DFACTURE Web Services for electronic invoicing with prior validation:

{| class="wikitable" style="margin: auto;"
|-
! style="background:#e9e9e9; text-align:center;"|Service
! style="background:#e9e9e9; text-align:center;"|Method
|- valign="center"
| Issue Web SOAP
|
* Enviar
* EstadoDocumento
* EnvioCorreo
* DescargaPDF
* DescargaXML
* FoliosRestantes
* CargarCertificado (Uso interno)
* DescargarEventoXML (Nuevo)
* GenerarContenedor (Nuevo)
* GenerarEvento (Nuevo)
|-
| Attached Web SOAP
| 
*CargarAdjuntos 
|-
|Reports Web SOAP (New)
|
* DescargarReporte
* ProgramarReporte
* SolicitudReporteSincrono
|}
{{clear}}
