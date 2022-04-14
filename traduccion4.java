<includeonly>=</includeonly>==Additional features ==<includeonly>=</includeonly>
===Use of extra fields===
The “extras” array allows optional fields to be inserted in the XML-Invoice and in the printed representation as desired.

The extra fields are not required by the DIAN, but in certain cases they are important and necessary in the issuer's business model. These incorporate additional information within the document, such as payment details, delivery, transportation, geographic coordinates, batch of products, merchandise expiration, medical services, aeronautical services, free information, among many others.

The extensible fields are designed according to parameters established in the Colombian Chamber of Electronic Commerce and the DIAN, with the purpose of being interoperable (this is not yet fully defined for the prior validation model). The information to be inserted in an extensible field must meet criteria associated with the specific field to be inserted. The structure of the “extras” object is as follows:

{| class="mw-collapsible mw-collapsed wikitable"
! style="background:#f2f2f2; text-align:center;"|Type
! style="background:#f2f2f2; text-align:center;"|Identifier
! style="background:#f2f2f2; text-align:center;"|Format
! style="background:#f2f2f2; text-align:center;"|Description
|- valign="center"
|-
|rowspan="6"|String
|controlInterno1
|<nowiki>AN|100	</nowiki>
|Assigned label for PDF Printed Representation.
|-
|controlInterno2	
|rowspan="2"|Depends on the field	
|It allows associating two or more fields by means of an index (if the fields are associable)
|-
|nombre
|Code of the extensible field to be referenced (there are codes defined by TFHKA for specific information and free codes can also be used).
|-
|pdf	
|<nowiki>N|1</nowiki>	
|Indication of showing the field in the PDF graphic representation (“0” u003d Do not show / “1” u003d Show).
|-
|valor	
|Depends on the field	
|Value of the field to add.
|-
|xml	
|<nowiki>N|1</nowiki>	
|Indication to show the field in the XML (“0” u003d Do not show / “1” u003d Show)
|}
{| class="mw-collapsible mw-collapsed wikitable"
! style="background:#f2f2f2; text-align:center;"|Example of use of Extensible Fields 443 (Seller)
|- valign="center"
|
               <ser:Extras>
                  <ser:controlInterno1>Vendedor</ser:controlInterno1>
                  <ser:controlInterno2></ser:controlInterno2>
                  <ser:nombre>443</ser:nombre>
                  <ser:pdf>1</ser:pdf>
                  <ser:valor>Pablo Marmol</ser:valor>
                  <ser:xml>0</ser:xml>
               </ser:Extras>
|-
! style="background:#f2f2f2; text-align:center;"|Field inserted into the PDF
|- valign="center"
|
[[Archivo:CampoExtensibleVendedor.png|800px|sinmarco|centro|CampoExtensibleVendedor]]
|}
'''@IMPORTANT:''' It is recommended that the Extras.xml property be set to '0', as The Factory HKA implements the use of nested CDATAS in the XML structure to reflect the extra fields, however some receiving platforms cannot interpret this standard and there may be rejections at the time of filing the document if this property is assigned the value '1'

The label that is assigned in Extras.ControlInternal1 is of free choice, as long as the stipulated format is respected. However, it will be necessary to know the other parameters, which will be supplied with the available fields:
* The code of the field, to place in Extras.name.
* If the field is repeatable and associable, to place a common index on Extras.InternalControl2. 
* The format of the field value, so that the information placed Extras.value is valid. 
In addition to the available fields (codes reserved by TFHKA), the use of FREE fields has been considered, to insert generic identifiers and values.
: Please note the following example to insert a free field:
{| class="mw-collapsible mw-collapsed wikitable"
! style="background:#f2f2f2; text-align:center;"|Example
|- valign="center"
|
             <ser:Extras>
                  <ser:controlInterno1>PRICE LIST</ser:controlInterno1>
                <ser:controlInterno2</ser:controlInterno2>
                <ser:nombre>1</ser:nombre>
                <ser:pdf>1</ser:pdf>
                <ser:valor>WHOLESALER</ser:valor>
                <ser:xml>0</ser:xml>
             </ser:Extras> 
|-
! style="background:#f2f2f2; text-align:center;"|Field inserted into the PDF
|- valign="center"
|
[[Archivo:CamposLibresMayorista.png|800px|sinmarco|centro|Uso de Campos Libres para insertar Identifieres y valores genéricos]]
|}

===Code table for extra fields===
At this moment the codes or Extras.name property for extra fields reserved by TFHKA (any other code used is considered free) are the following:
; Extensible Fields reserved by TFHKA
{| class="mw-collapsible mw-collapsed wikitable"   
! style="background:#f2f2f2; text-align:center;"|Code
! style="background:#f2f2f2; text-align:center;"|PDF label 
! style="background:#f2f2f2; text-align:center;"|Description
! style="background:#f2f2f2; text-align:center;"|Value format
! style="background:#f2f2f2; text-align:center;"|Observations
|- valign="center"
|-
|122333	
|Physical Acceptance	
|Physical Acceptance	
|<nowiki>AN|1000</nowiki>
|
|-	
|100200	
|Footer	
|Footer	
|<nowiki>AN|1000</nowiki>
|-	
|5170000	
|Total Excluded Base	
|Total Excluded Base	
|Free Format	
|For totals the R.G.
|-
|5170001	
|TOTAL Detail Discount	
|TOTAL Detail Discount	
|Free Format	
|For totals the R.G.
|-
|5170002	
|TOTAL Withholdings	
|TOTAL Withholdings	
|Free Format	
|For totals the R.G.
|-
|5170003	
|TOTAL to Pay	
|TOTAL to Pay	
|Free Format	
|For totals the R.G.
|-
|5170004	
|TOTAL TO PAY in Letters	
|TOTAL TO PAY in Letters	
|Free Format 	
|For totals the R.G.
|}
'''@IMPORTANT:''' The Physical Acceptance field can be applied in two scenarios. The first scenario, where the invoice is tacitly accepted and only the XML is generated (the PDF file is not generated on our platform), assuming that the delivery of the graphical representation is the responsibility of the user. The second scenario, in which the invoice is tacitly accepted and the XML and PDF are generated on our platform, which will be sent via email if the “notify” field is set to “YES”. For this last scenario, it is necessary that the "controlInterno2" field be set to "1".
<pre style="color: red">WARNING: If you use the option controlInterno2 u003d , our platform will not generate standard HKA representation, therefore PDF is not hosted on it and no It will be possible to view the graphic representation from the portal, in the purchaser's mail (view document section), download it through the service's DownloadPDF method, or forward it through the EnvioCorreo method.</pre>
{| class="mw-collapsible mw-collapsed wikitable"
! style="background:#f2f2f2; text-align:center;"|Example of the use of the extensible field 122333 in the XML
|- valign="center"
|
      <ser:Extras>
                  <ser:controlInterno1/>
                  <ser:controlInterno2>1<ser:controlInterno2>
                  <ser:nombre>122333</ser:nombre>
                  <ser:pdf>0</ser:pdf>
                  <ser:valor>1</ser:valor>
                  <ser:xml>0</ser:xml>
      </ser:Extras>
|}
===Personalized email===
The “extras” arrangement also allows you to handle some special features of the platform, such as personalized email. So that this information does not appear in the graphical representation, the pdf parameter of the “extras” object must be set to “0”.

<span style="color:#FFFF; background:#FF0000"><b>@IMPORTANT:</b></span> It is recommended that the '''Extras.xml''' property be set to '0', as The Factory HKA implements the use of nested CDATAS in the XML structure to reflect the extra fields, however some receiving platforms cannot interpret this standard and there may be rejections at the time of filing the document if this property is assigned the value '1'.

<span style="color:#FFFF; background:#FF0000"><b>@IMPORTANT:</b></span> It is recommended that the '''Extras.pdf''' is set to the value '0', so that the indicated information is not displayed in the standard graphical representation.
The custom email functionality allows you to configure the email subject, reply address and body on a transaction-by-transaction basis. The way to expose this information will be through extra fields.
; Expandable Fields for Personalized Email
{| class="mw-collapsible mw-collapsed wikitable"   
! style="background:#f2f2f2; text-align:center;"|Code
! style="background:#f2f2f2; text-align:center;"|PDF label 
! style="background:#f2f2f2; text-align:center;"|Description
! style="background:#f2f2f2; text-align:center;"|Value format
! style="background:#f2f2f2; text-align:center;"|Observations
|- valign="center"
|-
|11	
|Email Body	
|Email Body	
|<nowiki>AN | 1000</nowiki>	
|String that contains the html code of the email body. 
|-
|13	
|Subject of the Email	
|Subject of the Email	
|<nowiki>AN | 100</nowiki>	
|Defined in the Technical Annex V1.7-2020 of the <nowiki>DIAN**</nowiki>
|-
|14	
|Respond to	
|Respond to	
|<nowiki>AN | 100</nowiki>	
|A single email address must be entered
|-
|1700	
|Line of Business	
|Line of Business	
|<nowiki>AN|100</nowiki>	
|(Optional) Inclusion of line of business in the email subject
|}
<nowiki>**</nowiki> The subject must comply with the following format: 
: NIT of the Electronic Biller; Name of the Electronic Biller; Electronic Document Number; Document type code according to Table 1; Biller's business name; Business line (this last one optional, commercial agreement between the parties).
{| class="mw-collapsible mw-collapsed wikitable"
! style="background:#f2f2f2; text-align:center;"|Example of use of Extensible Fields 11,13 and 14 to personalize the Email
|- valign="center"
|
            <ser:extras>
               <ser:Extras>
                  <ser:controlInterno1>Email Body</ser:controlInterno1>
                  <ser:controlInterno2></ser:controlInterno2>
                  <ser:nombre>11</ser:nombre>
                  <ser:pdf>0</ser:pdf>
                  <ser:valor>Test String Email Body
                             @email.documento.urlAcuseRecibo</ser:valor>
                  <ser:xml>0</ser:xml>
               </ser:Extras>         
               <ser:Extras>
                  <ser:controlInterno1>Subject of the Email</ser:controlInterno1>
                  <ser:controlInterno2></ser:controlInterno2>
                  <ser:nombre>13</ser:nombre>
                  <ser:pdf>0</ser:pdf>
                  <ser:valor>@email.emisor.razonSocial has sent you the                       
                             @email.documento.TypeDocumento @email.documento.numeroDocumento
                  </ser:valor>
                  <ser:xml>0</ser:xml>
               </ser:Extras>                              
               <ser:Extras>
                  <ser:controlInterno1>Respond to</ser:controlInterno1>
                  <ser:controlInterno2></ser:controlInterno2>
                  <ser:nombre>14</ser:nombre>
                  <ser:pdf>0</ser:pdf>
                  <ser:valor>notifications@thefactoryhka.com</ser:valor>
                  <ser:xml>0</ser:xml>
               </ser:Extras>
|}
In order for the email to have the capacity to adopt the data of the transaction, a set of code variables is proposed, which will be replaced in the platform by the own value generated in it. These variables are shown below:
; Expandable Fields for Personalized Email
{| class="mw-collapsible mw-collapsed wikitable"   
! style="background:#f2f2f2; text-align:center;"|Section
! style="background:#f2f2f2; text-align:center;"|Descriptor
! style="background:#f2f2f2; text-align:center;"|Referential value
! style="background:#f2f2f2; text-align:center;"|Type
! style="background:#f2f2f2; text-align:center;"|Location
|- valign="center"
|-
|rowspan="7"|Invoice information
|Electronic Document Number	
|@email.documento.numeroDocumento	
|Unique	
|Subject/Body
|-
|CUFE	
|@email.documento.cufe	
|Unique	
|Subject/Body
|-
|Date of Issue	
|@email.documento.fechaEmision	
|Unique	
|Subject/Body
|-
|Time of Issue	
|@email.documento.horaEmision	
|Unique	
|Subject/Body
|-
|Type of Electronic Document	
|@email.documento.TypeDocumento	
|Unique	
|Subject/Body
|-
|Type of Invoice	
|@email.documento.TypeFactura	
|Unique	
|Subject/Body
|-
|-
|Respond to	
|@email.documento.responderA	
|Unique	
|Cuerpo
|-
|rowspan="5"|Issuing	
|Type of Taxpayer	
|@email.emisor.TypeContribuyente	
|Unique	
|Subject/Body
|-
|Type of Identity Document	
|@email.emisor.TypeIdentidad	
|Unique	
|Subject/Body
|-
|Identity Document Number	
|@email.emisor.numeroIdentidad	
|Unique	
|Subject/Body
|-
|Company Name	
|@email.emisor.razonSocial	
|Unique	
|Subject/Body
|-
|Logo	
|@email.emisor.logo	
|Unique	
|Cuerpo
|-
|rowspan="4"|Purchaser	
|Type Contribuyente	
|@email.receptor.TypeContribuyente	
|Unique	
|Subject/Body
|-
|Type of Identity Document
|@email.receptor.TypeIdentidad	
|Unique	
|Subject/Body
|-
|Identity Document Number	
|@email.receptor.numeroIdentidad	
|Unique	
|Subject/Body
|-
|Company Name	
|@email.receptor.razonSocial	
|Unique	
|Subject/Body
|-
|Acknowledge	
|Receipt Acknowledgment	
|@email.documento.urlAcuseRecibo	
|Unique	
|Cuerpo
|}
{| class="mw-collapsible mw-collapsed wikitable"
! style="background:#f2f2f2; text-align:center;"|Example of String for Email Body in html
|- valign="center"
|
<nowiki><p>Dear @email.receptor.razonSocial, you have received an ELECTRONIC DOCUMENT from @email.emisor.razonSocial; shipment made through the Technology Provider The Factory HKA Colombia SAS</p><div style="text-align:center;"><a style=" background-color: #154380; border: 1px solid #ffffff; border-radius: 20px; color: #ffffff; display: inline-block; font-family: sans-serif; font-size: 25px; font-weight: bold; line-height: 60px; text-align: center; text-decoration: none; width: 300px; -webkit-text-size-adjust: none;" class="btn btn-block btn-info" href="@email.documento.urlAcuseRecibo" target="_blank">Acknowledgment of receipt</a><br></div><br>Please review the electronic document and press the Acknowledgment button<br><b>This E-mail has been sent automatically, do not Respond to this account. </b><b>@email.advertencia</b><p>The information contained in this E-mail is confidential. If you received this email by an error, Please forward and delete</p></div></nowiki>
|}
@IMPORTANT: In order for the service to take the dynamic configuration of the “Email Body” field, the @email.documento.urlAcuseRecibo attribute must be present.
{{clear}}
=== GENERATION OF NOTES WITH AND WITHOUT DOCUMENT REFERENCE ===
For the generation of credit and debit notes, 3 scenarios are described:

==== Credit and debit notes that affect prior validation invoices ====
For the issuance of credit and debit notes, two referenced document arrangements must be sent, the first indicating the internal code u003d '4' which corresponds to the reasons for which the NC/ND ('''DiscrepancyResponse''') is generated and a second arrangement, indicating the internal code u003d '5' in which the data of the invoice affected by the NC/NC ('''BillingReference'''). 
: Example:
<pre>
 <a:documentosReferenciados>
      <a:DocumentoReferenciado>
	<a:codigoEstatusDocumento>2</a:codigoEstatusDocumento>
	<a:codigoInterno>4</a:codigoInterno>			
	<a:Description>
	   <b:string>Cancellation of electronic invoice</b:string>
	</a:descripcion>
	<a:fecha>2019-10-07</a:fecha>
	<a:numeroDocumento>F4PM3</a:numeroDocumento>
	</a:DocumentoReferenciado>
	<a:DocumentoReferenciado>
	<codigoInterno>5</codigoInterno>			<cufeDocReferenciado>85ea749b18ee5bd251b87442935650e30b4e0e4cd662bef1KqmCLKgxPpH6u5LiKrJvTb6FEyfVuoCcV0baab6b59cdc8b3</cufeDocReferenciado>
	<fecha>2019-10-07</fecha>
	<numeroDocumento>F4PM3</numeroDocumento>
	</a:DocumentoReferenciado>
      </a:documentosReferenciados>
</pre>
<span style="color:#FFFF; background:#FF0000"><b>@IMPORTANT:</b></span>  The '''cufeDocReferenciado''' field must contain a total of 96 characters and the value of the FacturaGeneral.tipoOperacion field must be 20 (for NC) and 30 (for ND).

==== Credit and debit notes that do not affect invoices ====
Bear in mind that in each scenario the '''FacturaGeneral.TypeOperacion'''field must be correctly indicated: 
* Code 22 for Credit Notes.
* Code 32 for Debit Notes.
According to what is described in the Technical Annex version 1.8

[[Archivo:Notas.TypeOperacion.png|800px|sinmarco|centro|Notas.TypeOperacion]]

<span style="color:#FFFF; background:#FF0000"><b>@IMPORTANT:</b></span> The Referenced Documents class must be sent in NULL.

=== TRANSMISSION OF CONTINGENCY DOCUMENTS TYPE 03 (ATTRIBUTABLE TO THE ISSUER) ===
The technological drawbacks on the part of the electronic biller imply that electronic invoicing has the following characteristics:
* Generate billing with contingency numbering on paper or by computer.
* The electronic biller must generate a letter declaring the technological inconvenience or overcoming it, which must be signed by the legal representative of the company and send it to the email contingencia.facturadorvp@dian.gov.co with the following: o Subject: Nit of the company separated with a dash the verification digit; Company name. 
** Attached: PDF of the letter where they are declared in contingency with the signature of the legal representative. 
** Body of the mail: Contact information (Names, telephone / Contact cell phone). 
*** Note: This email will only be for receiving emails from electronic billers to report the contingency or overcome technological inconveniences.
*** Note: Additionally, if you want to deliver these records in writing, you can do so through filings, which must be sent to the DIAN - central level - electronic invoice. 
* The invoicer will have 48 hours from the date on which the contingency is exceeded to transmit the electronic invoices in XML format to the DIAN.
* The electronic invoices generated and issued in contingency will pass the annex validation mesh, that is, the DIAN will respond with an Application Response of Document Validated by the DIAN, which will inform the notifications that may take place.
* Once the electronic invoicer leaves the contingency, it must proceed to the normal generation process.
* For credit note and debit note documents, the biller must NOT use the contingency numbering, but rather the normal consecutive number. The notes sent to the DIAN will be validated in the normal way in the DIAN. Due to the above, there is no concept of a contingency note, so care must be taken to first send the Contingency Invoices before generating notes on them and it is recommended to generate them in a normal operating environment.

====How to transmit a Type 03 contingency document?====
The transmission of the document is done through the '''Enviar''' of the Issuance Web Service provided by The Factory HKA, indicating the '''TypeDocumento''' attribute of the '''FacturaGeneral''' object equal to '03' and sending an object in the '''documentosReferenciados''' section, of the Issuance Web Service provided by The Factory HKA, indicating the '''TypeDocumento''' attribute of the '''FacturaGeneral''' object equal to '03' and sending an object of Type '''DocumentosReferenciados''' indicating the following:, of Type '''Referenced Documents''' indicating the following:
* '''codigoInterno''' = ‘1’ 
* '''fecha''' = ‘Date of issuance of the contingency document’ 
* '''numeroDocumento''' = ‘consecutive number of the issued contingency document’ 
* '''TypeCodigoDocumento''' = ‘Type of support document for the billing process for contingencies attributable to the electronic biller to be transmitted, as stipulated in numeral 12.1.4 of version 1.8 of the DIAN Technical Annex ’.
:: Types of supporting documents for the contingency billing process attributable to the electronic biller
{| class="mw-collapsible mw-collapsed wikitable"
! style="background:#f2f2f2; text-align:center;"|Code
! style="background:#f2f2f2; text-align:center;"|Description
|-
|FTC	
|Invoice Checkbook Contingency
|-
|FTP	
|Invoice Check Book Paper
|}

==== What will be the successful transmission response code that will be returned by the TFHKA WS? ====
The Send method will return code 201 or 208 upon successful receipt of the document on our platform, with the following message: "The document was received as an Electronic Contingency Document Type 03, it will be delivered asynchronously to the DIAN, for more information please consume DocumentStatus after 48 hours.” In said Response there will be CUDE and UBL.

==== When can I consult the result of the transmission of the document to the DIAN? ====
After 48 hours after filing the document on the platform, you can check its status to find out the result of the transaction before the DIAN.

==== Quick response QR code generation for contingency invoices ====
For the generation of the Quick Response Code - QR Code, in cases where the checkbook or paper sales invoice is generated through electronic computer systems, it must correspond to the following table:
{| class="mw-collapsible mw-collapsed wikitable"
! style="background:#f2f2f2; text-align:center;"|Detail
|-
|NumFac: [NUMERO_FACTURA]
|-
|FecFac: [FECHA_FACTURA]
|-
|HorFac: [HORA_FACTURA(con GMT)]
|-
|NitFac: [NIT FACTURADOR]
|-
|DocAdq: [NUMERO_ID_ADQUIRIENTE]
|-
|ValFac: [VALOR_FACTURA]
|-
|ValIva: [VALOR_IVA]
|-
|ValOtroIm: [VALOR_OTROS_IMPUESTOS]
|-
|ValTolFac: [VALOR_TOTAL_FACTURA]
|}
; Ejemplo:
<pre>
NumFac: CTG2
FecFac: 2020-06-16
HorFac: 00:00:00-05:00
NitFac: 900390126
DocAdq: 901041710
ValFac: 1003.00
ValIva: 190.57
ValOtroIm: 0.00
ValTolFac: 1193.57
</pre>
: SOAP Request Example of Contingency Invoice Type 03

[[Archivo:Ejemplo SOAP Request de Factura de Contingencia Type 03.png|800px|sinmarco|centro|Ejemplo SOAP Request de Factura de Contingencia Type 03]]

<span style="color:#FFFF; background:#FF0000"><b>@IMPORTANT:</b></span> It is not required that the acquirer be notified of the contingency documents transmitted to the DIAN, since the document physically delivered to it during the period in which the contingency was maintained corresponds to the legal document of the transaction carried out. The transmission of said information to the DIAN is for the purpose of notifying the regulatory entity of the transactions carried out during said period. Due to the above, it is recommended to send the '''notify''' field u003d 'NO' and not send the corresponding information to the '''Recipient''':

[[Archivo:Ejemplo SOAP Request de Factura de Contingencia Type 03. Notifica NO.png|800px|sinmarco|centro|Ejemplo SOAP Request de Factura de Contingencia Type 03 sin notificar]]

==== Notes to Documents in Contingency ====
As mentioned above, credit or debit notes do not have a contingency scheme, therefore, they must be generated in normal operations. Starting from this principle, the following scenarios emerge:
# If the note to be issued is electronically issued: 
#:a. <u>''Affecting an electronic invoice:''</u> The note is issued in normal billing operation, taking into account informing the reference to documents in the attribute '''documentosReferenciados''' of the object '''FacturaGeneral''', sending two objects of Type '''DocumentosReferenciados ''' indicating the following: 
#::i. <u>''Object 1 (to generate DiscrepancyResponse):''</u> the fields codigoEstatusDocumento; codigoInternou003d'4' and cufeDocReferenciado. 
#::ii. <u>''Object 2 (to generate Billingreference):''</u> the fields codigoInterno=‘5’; cufeDocReferenciado; fecha; TypeCUFE and numeroDocumento. 
#:b. <u>''Affecting a contingency invoice:''</u> The issuance of the note in this scenario will depend on:
#::i.  <u>''Contingency Bill is transmitted to the DIAN:''</u> The note is issued in normal billing operation, taking into account informing the reference to documents in the attribute '''documentosReferenciados''' of the object '''FacturaGeneral''', sending two objects of Type '''DocumentosReferenciados''' indicating the following: 
#::: <u>''Object 1 (to generate DiscrepancyResponse):''</u> the fields codigoEstatusDocumento; codigoInterno=‘4’ and cufeDocReferenciado=’CUDE of the document’. 
#::: <u>''Object 2 (to generate Billingreference):''</u> the fields codigoInterno=‘5’; cufeDocReferenciado=’CUDE of the document’; date; TypeCUFE and numeroDocumento.  
#::ii. <u>''Contingency invoice has not been transmitted to the DIAN:''</u> The issuance of the note "in contingency" (indicating consecutive and issue date of the affected invoice), with commitment of subsequent delivery to the DIAN, synchronized with the filing of the contingency invoice before the entity.
# Si la nota a emitir se expide “en contingencia”:
#:a. <u>''Afectando a una factura electrónica:''</u> The issuance of the note "in contingency" (indicating consecutive and issue date of the affected invoice), with commitment of subsequent delivery to the DIAN, synchronized with the filing of the contingency invoice before the entity.
#:b. <u>''Afectando a una factura de contingencia:''</u> The issuance of the note "in contingency" (indicating consecutive and issue date of the affected invoice), with commitment of subsequent delivery to the DIAN, synchronized with the filing of the contingency invoice before the entity.

===Submit electronic documents on reception platforms===
The XML that must be filed in the reception platforms is the one that our service sends in the mail notification called '''AttachedDocument''' (Document Container), the structure of this document is intended to contain in a single XML file an electronic document (Invoice, CreditNote or DebitNote) and all the events (ApplicationResponse) registered to date, this XML can also be downloaded through the '''GenerarContenedor''' method.

[[Archivo:RadicarAttachedDocument (Contenedor de Documentos).png|800px|sinmarco|centro|Radicar AttachedDocument (Contenedor de Documentos)]]

[[Archivo:RadicarAttachedDocument (Contenedor de Documentos)UBL.png|800px|sinmarco|centro|Radicar AttachedDocument (Contenedor de Documentos) UBL]]

===Standard of the name of XML electronic documents===
The DIAN establishes in the Technical Annex the nomenclature that electronic documents must have.

<span style="color:#FFFF; background:#FF0000"><b>@IMPORTANT:</b></span> Through the Response of the Send method, they can capture the name of the document and later use this property, through the GenerarContenedor method, download the AttachedDocument and replace the first two initials with “ad”.

[[Archivo:nomenclaturaDIANdocumentoselectrónicos.png|800px|sinmarco|centro|nomenclaturaDIANdocumentoselectrónicos]]

===Enablement environment===
The released test environment (demo environment) corresponds to a technology provider's own test environment (The Factory HKA) with the aim that developers and Software Houses can test the adjustments made to the ERP under the billing model.

The enabling stage, in which the tests performed by the clients are sent to the DIAN testing web service, will be carried out in the productive environment of the TFHKA service. Once these tests have been satisfactorily completed, the DIAN will enable them as electronic billers.

Subsequently, they may start the issuance of electronic documents in normal operation.

====Transmission of Evidence Documents to the DIAN in a DEMO environment====
At this time, the issuance of test documents ('''DEMO environment''') directly against the DIAN is functional, that is, being able to carry out integration tests from your ERP with 100% DIAN validations without going through the local XSLT. 

To reproduce this test scenario, the following configuration must be taken into account in the DEMO web portal:
# Enter to the Demo portal through the following URL: [https://demofactura.thefactoryhka.com.co/auth/login]
# Make the following settings:
#:a. The Issuing client must verify that their NIT is configured in the Fiscal Data, regardless of whether they have their own certificate loaded or that of The factory HKA:
[[Archivo:ConfigDatosFiscales.png|800px|sinmarco|centro|Configurar Datos Fiscales]]
#:b You must have requested the authorization resolution granted by the DIAN (resolution for a set of authorization tests), this resolution must be configured in the DEMO web portal as shown in the following image (bear in mind that the mode can be 'Manual with Prefix' or 'Manual without Prefix', this depends on the ERP):, with Prefix' or 'Manual without Prefix', it depends on the ERP):
[[Archivo:ConfigResolucion.png|800px|sinmarco|centro|Configurar Resolución]]
#:<span style="color:#FFFF; background:#FF0000"><b>@IMPORTANT:</b></span> The sequential must be configured with the Production2.1 environment Type, therefore the setTestID field must not be entered. '''It is recommended to indicate an Initial Range from one million (1,000,000), this in order to have a wide range for tests against the DIAN without affecting the range to be used in the emissions corresponding to the Enabling Set to be carried out in the productive environment.'''
#:c. Request by mail to the Integration or Support team the activation of the sequence previously created in the DEMO portal with the option of sending it to the DIAN:
:::* [mailto:integracion_fel_co@thefactoryhka.com integracion_fel_co@thefactoryhka.com] (Integration Department)
:::* [mailto:soporte_fel_co@thefactoryhka.com soporte_fel_co@thefactoryhka.com] (Support Department)
::: The e-mail must indicate the NIT of the Issuer and the configured prefix, which may be SETT or SETP depending on the prefix that the DIAN granted to the Issuer for its authorization.

<pre style="color: red">@NOTA: The emissions carried out in the testing environment with the enabling sequence will not affect the emissions corresponding to the enabling set in the production environment. Additionally, these emissions are not considered part of the rating set.</pre>
