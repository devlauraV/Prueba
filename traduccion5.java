<includeonly>=</includeonly>==Tables of property codes for issuance of documents==<includeonly>=</includeonly>
In the following section you will find information regarding the different tables of property codes defined by the DIAN in the technical annex.
==Table 1==
{| class="wikitable" style="width: 100%;"
|+ Types of Documents
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.8-2021 - 13.1.3. Tipo de Documento: cbc:InvoiceTypeCode y cbc:CreditnoteTypeCode
{| class="wikitable" style="width: 100%;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Meaning
! style="color:white;background:#2F5496; text-align:center;"|Use
|- valign="center"
|-
|01
|Electronic Sales Invoice
|rowspan="4"|Types of Invoice
|-
|02
|Electronic Sales Invoice - export
|-
|03
|Transmission electronic document - type 03
|-
|04
|Electronic Sales Invoice - type 04
|-
|91
|Credit note
|rowspan="4"|Exclusive in document references (DocumentReference elements)
|-
|92
|Debit note
|}
|}
==Table 2==
{| class="wikitable" style="width: 100%;"
|+ Operation types
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.8-2021 - 13.1.5. Operation types
For billss:	
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Value
|- valign="center"
|-
|10
|Start*
|-
|09
|AIU
|-
|11
|Mandates
|-
|12
|Transportation
|-
|13
|Exchange
|}
Note: (*) Value by default Health Operation

{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
|- valign="center"
|-
|SS-CUFE
|-
|SS-CUDE
|-
|SS-POS
|-
|SS-SNum
|-
|SS-Recaudo
|}
Note: The explanation and validity of the Operation types for the health sector will be reported at http://url.minsalud.gov.co/facturacion-electronica once the Ministry of Health informs all the actors regulated by them.
For Credit Notes:
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Value
|- valign="center"
|-
|20
|Note Credit that references an electronic invoice*
|-
|22
|Credit note without reference to invoices*
|-
|}
Note: (*) The default value is 20, the above means that if a value is not reported, it is assumed to be 20 and the corresponding set of validations will be applied. (*) Preferable for use of rebate notes or conditional discounts. Notes type 22 do not have rejection validation. Post Control Object. For Debit Notes:
For Debit Notes:
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Value
|- valign="center"
|-
|30
|Note Debit that references an electronic invoice*	
|-
|32
|Debit note without reference to invoices*
|-
|}
Note: The default value is 30, the above means that if a value is not reported, add 30 and apply the corresponding set of validations. Notes type 32 and 33 do not have rejection validation. Post Control Object.
|}
'''@IMPORTANT:''' Notes type 22 and 32 do not have rejection validation. (Post control object).
	
==Table 3==	
{| class="wikitable" style="width: 100%;"
|+ Identification Types
|- valign="center" 	
|-style="text-align:center;" 
|colspan="2"|Anex 1.8-2021 - 13.2.1. Identification document (Type of Fiscal Identifier):  
cbc:CompanyID.@schemeName; sts:ProviderID.@schemeName 
{| class="wikitable" style="width: 100%;" style="margin: auto;" 
! style="color:white;background:#2F5496; text-align:center;"|Code 
! style="color:white;background:#2F5496; text-align:center;"|Meaning 
|- valign="center"
|11
|Civil registration
|-
|12
|ID card
|-
|13
|Certificate of Citizenship
|-
|21
|Alien Card
|-
|22
|Immigration certificate
|-
|31
|NIT
|-
|41
|Passport
|-
|42
|Foreign ID
|-
|47
|PEP
|-
|50
|NIT from another country
|-
|91
|NUIP*
|}
|}
'''@IMPORTANT:''' (*) It should only be used for the acquirer, since this type of document does not belong to the document types in the RUT database.

==Table 4==
{| class="wikitable" style="width: 100%;"
|+ Descount Code 
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.8-2021 - 13.3.8. Descount Codes
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Meaning
|- valign="center"
|-
|00
|Unconditional discount
|-
|01
|Conditional Discount
|}
|}
==Table 5==
{| class="wikitable" style="width: 100%;"
|+ TType of person
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.8-2021 - 13.2.3. Type of legal organization (People): cbc:AdditionalAccountID
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Meaning
|- valign="center"
|-
|1
|Legal person and assimilated
|-
|2
|Natural person and assimilated
|}
|}
==Table 6==
{| class="wikitable" style="width: 100%;" 
|+ Units of Measure 
|- valign="center" 
|-style="text-align:center;" 
|colspan="2"|Anex 1.8-2021 - 13.3.6. Units of amount: @unitCode 
{| class="wikitable" style="width: 100%;" 
! style="color:white;background:#2F5496; text-align:center;"|Code 
! style="color:white;background:#2F5496; text-align:center;"|Description 
! style="color:white;background:#2F5496; text-align:center;"|Code 
! style="color:white;background:#2F5496; text-align:center;"|Description 
! style="color:white;background:#2F5496; text-align:center;"|Code 
! style="color:white;background:#2F5496; text-align:center;"|Description 
|- valign="center" 
|- 
|04 
|small spray 
|BIL 
|trillion dollars 
|HUR 
|hour 
|- 
|05 
|lift 
|BJ 
|bucket 
|HY 
|hundred yardas 
|- 
|08 
|Lot Heat 
|BK 
|Basket 
|IA 
|Inch Pound 
|- 
|10 
|group 
|BL 
|bullet 
|IC 
|count per inch 
|- 
|11 
|equip 
|BLD 
|dry barrel 
|IE 
|person
|- 
|13 
|ration 
|BLL 
|barrel (EE.UU.)(petroleo, etc.) 
|IF 
|inches of water 
|- 
|14 
|shot 
|BO 
|bottle 
|II 
|column inch 
|-
|15
|stick
|BP
|hundred board feet
|IL
|inch per minute
|-
|16
|hundred and fifteen kg drum
|BQL
|becquerel
|IM
|printing
|-
|17
|hundred pound drum
|BR
|bar
|INH
|inch
|}
|}
 '''@IMPORTANT:''' This catalog is more extensive, for more information refer to the section of the corresponding Annex.
==Table 7==
{| class="wikitable" style="width: 100%;"
|+ Reference pricing codes
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.8-2021 - 13.3.9. Type of legal organization (Persons): cbc:AdditionalAccountID
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Meaning
|- valign="center"
|-
|01
|Commercial value
|}
<span style="color:#FF0000; text-align:left;"><b>Note: </b></span> For commercial samples or gifts, '01' must be sent in the field '''codigoTipoPrecio'''
|}
==Table 8==
{| class="wikitable" style="width: 100%;"
|+ Codes for products and services
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.7-2020 - 6.2.3. Type of legal organization (People): cbc:AdditionalAccountID
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|@schemeID
! style="color:white;background:#2F5496; text-align:center;"|@schemeName
! style="color:white;background:#2F5496; text-align:center;"|schemeAgencyID
! style="color:white;background:#2F5496; text-align:center;"|To use
|- valign="center"
|-
|001
|UNSPSC
|10
|style="text-align:left;"|Colombia Efficient Purchase: use content of the "Code" column
* Ver 8.1
|-
|010
|GTIN
|9
|style="text-align:left;"|Global Product Identification Numbers - GTIN
* Ver 8.2
*  When there are fewer than 14 numbers in a data structure (for example, GTIN8), the numbers must be right-justified in a 14-digit field padded with zeros in the leftmost positions.
|-
|020
|rate item
|195
|style="text-align:left;"|rate item
|-
|999
|Taxpayer Adoption Standard
|
|style="text-align:left;"|
* The value in the @schemeName attribute will not be validated
* The @schemeAgencyID attribute must not be used
|}
<span style="color:#FF0000;"><b>Note: </b></span> For commercial samples or gifts, '01' must be sent in the '''codigoTipoPrecio''' field.
'''@IMPORTANT:''' For more information on the code for products and services, refer to the section of the corresponding Annex.
==Table 9==
{| class="wikitable" style="width: 100%;"
|+ Credit Note Reasons
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.8-2021 - 13.3.4. Correction concept for credit notes: cac:DiscrepancyResponse/cbc:ResponseCode
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Description
|- valign="center"
|-
|1
|style="text-align:left;"|Partial return of goods and/or partial non-acceptance of service
|-
|2
|style="text-align:left;"|Electronic invoice cancellation
|-
|3
|style="text-align:left;"|Rebate or partial or total discount
|-
|4
|style="text-align:left;"|Price Adjust
|-
|5
|style="text-align:left;"|others
|}
|}

==Table 10==
{| class="wikitable" style="width: 100%;"
|+ Debit Note Reasons
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.7-2020 - 6.2.6. Concept of Correction for Debit Notes: cac:DiscrepancyResponse/cbc:ResponseCode
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Description
|- valign="center"
|-
|1
|style="text-align:left;"|Interests
|-
|2
|style="text-align:left;"|Expenses receivable
|-
|3
|style="text-align:left;"|Value change
|-
|4
|style="text-align:left;"|others
|}
==Table 11==
{| class="wikitable" style="width: 100%;"
|+ Tax Types
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.7-2020 - 6.2.2. Tributos: cac:TaxScheme/ID, cac:TaxScheme/Name
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Identifier
! style="color:white;background:#2F5496; text-align:center;"|Name
! style="color:white;background:#2F5496; text-align:center;"|Description
|- valign="center"
|-
|01
|IVA
|style="text-align:left;"|Value Added Tax
|-
|02
|IC
|style="text-align:left;"|Consumption Tax
|-
|03
|ICA
|style="text-align:left;"|Industry, Commerce and Notice Tax
|-
|04
|INC
|style="text-align:left;"|National Consumption Tax
|-
|05
|ReteIVA
|style="text-align:left;"|Withholding on IVA
|-
|06
|ReteRenta
|style="text-align:left;"|Withholding on Income
|-
|07
|ReteICA
|style="text-align:left;"|Withholding on the ICA
|-
|08
|IC Porcentual
|style="text-align:left;"|Tax on Consumption of Plastic Bag
|-
|20
|FtoHorticultura
|style="text-align:left;"|Fruit and Vegetable Promotion Fee
|-
|21
|Timbre
|style="text-align:left;"|Stamp Tax
|-
|22
|INC Bolsas
|style="text-align:left;"|National Tax on Plastic Bag Consumption
|-
|23
|INCarbono
|style="text-align:left;"|National Carbon Tax
|-
|24
|INCombustibles
|style="text-align:left;"|National Tax on Fuels
|-
|25
|Sobretasa Combustibles
|style="text-align:left;"|Surcharge on fuels
|-
|26
|Sordicom
|style="text-align:left;"|Retail Contribution (Fuels)
|-
|30
|IC Datos
|style="text-align:left;"|Data Consumption Tax
|-
|ZY
|No causa
|style="text-align:left;"|Not responsible for tax
|-
|ZZ
|Name of the tax figure
|style="text-align:left;"|Other taxes, rates, contributions, and similar
|}
|}
==Table 12==
{| class="wikitable" style="width: 100%;"
|+ Tax Fees
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.7-2020 - 6.3.8. Rate Tables for Tax
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Reporting tax
! style="color:white;background:#2F5496; text-align:center;"|Possible values for the cbc:Percent field
The rate to report will depend on the tax aspect of the reported tax.
|- valign="center"
|-
|IVA
|style="text-align:left;"|
{|
|-
| style="width:700px;|&nbsp;
| style="width:50px;|rate
|&nbsp;
|-
|   Concept|| rate || (cbc:Percent)|| &nbsp;
|-
|   Exempt|| 0.00 || &nbsp;|
|-
|   Goods/Services at 5|| 5.00 || &nbsp;|
|-
|   Contracts signed with the state before law 1819|| 16.00 || &nbsp;
|-
|   General rate|| 19.00 || &nbsp;
|}
|-
|INC
|style="text-align:left;"|
{|
|-
| style="width:700px;|&nbsp;
|rate
|&nbsp;
|-
|  Item &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|| (cbc:Percent)|| &nbsp;
|-
|   Special rate|| 2.00 || &nbsp;
|-
|   Special rate|| 4.00 || &nbsp;|
|-
|   General rate|| 8.00 || &nbsp;|
|-
|   Special rate|| 16.00 || &nbsp;|
|}
|-
|ReteIVA
|style="text-align:left;"|
15.00<br>
100.00
|}
|}
<span style="color:#FF0000;"><b>@IMPORTANT: </b></span>This catalog '''fees for Tax''' is more extensive, for more information refer to the section of the corresponding Annex.

==Table 13==
{| class="wikitable" style="width: 100%;"
|+ Payment methods 
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.7-2020 - 6.3.4.2. Payment methods: cbc:PaymentMeansCode
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Medio
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Medio
|- valign="center"
|-
|1
|Instrument not defined
|39
|Corporate Exchange Business Loan (CTX)
|-
|2
|Crédito ACH
|40
|Business Debit Corporate Exchange (CTX)
|-
|3
|Débito ACH
|41
|Concentration Cash/Credit Disbursement Plus (CCD+)
|-
|4
|ACH demand debit reversal 
|42
|Bank collection
|-
|5
|Reversal of ACH demand credit
|43
|Cash concentration / Debit plus Disbursement (CCD+)
|-
|6
|ACH Demand Credit
|44
|Exchange Note
|-
|7
|ACH demand debit
|45
|Transfer Bank Credit
|-
|8
|Maintain
|46
|Interbank Debit Transfer
|-
|9
|National or Regional Clearing
|47
|Bank Debit Transfer
|-
|10
|Cash
|48
|Credit card
|-
|11
|Credit Savings Reversal 
|49
|Debit Card
|-
|12
|Reversion Debit Savings
|50
|Postdraft
|-
|13
|Savings Credit
|51
|French banking standard Telex
|-
|14
|Debit Saving
|52
|Urgent business payment
|-
|15
|Bookentry Credit
|53
|Urgent Treasury Payment
|-
|16
|Bookentry Debit
|60
|Note promisoria
|-
|17
|Concentration of demand in cash/Credit Disbursement (CCD)
|61
|Promissory note signed by the creditor
|-
|18
|Concentration of demand in cash / Disbursement (CCD) debit
|62
|Promissory note signed by the creditor, endorsed by the bank
|-
|19
|Corporate Business Payment Credit (CTP)
|63
|Promissory note signed by the creditor, endorsed by a third party
|-
|20
|Check
|64
|Note promisoria firmada pro el banco
|-
|21
|Poyecto bancario
|65
|Promissory note signed by a bank guaranteed by another bank
|-
|22
|Certified bank project  
|66
|Signed promissory note
|-
|23
| Bank check 
|67
|Promissory note signed by a third party guaranteed by a bank
|-
|24
|Foreign exchange note awaiting acceptance 
|70
|Withdrawal of note by creditor
|-
|25
|Certified check 
|71
|Bonds
|-
|26
|Local Check  
|72
|Vouchers
|-
|27
|Debit Payment Corporate Business (CTP) 
|74
|Withdrawal of note by the creditor on a bank
|-
|28
|Credit Business Corporate Exchange (CTX)  
|75
|Withdrawal of note by the creditor, guaranteed by another bank
|-
|29
|Debit Business Corporate Exchange (CTX)  
|76
|Withdrawal of note by the creditor, on a bank guaranteed by a third party
|-
|30
|Credit Transfer 
|77
|Withdrawal of a note by the creditor on a third party
|-
|31
|Transfer Debit 
|78
|Withdrawal of a note by the creditor on a third party guaranteed by a bank
|-
|32
|Concentration Cash / Disbursement Credit plus (CCD+)  
|91
|Transferable bank note
|-
|33
|Concentration Cash / Disbursement Debit plus (CCD+)  
|92
|Local transferable check
|-
|34
|Pre-arranged payment and deposit (PPD)  
|93
|Referenced draft
|-
|35
|Cash concentration savings / Credit Disbursement (CCD)  
|94
|Urgent transfer
|-
|36
|Cash concentration savings / Credit Disbursement (CCD)  
|95
|Open format draft
|-
|37
|Payment Corporate Business Savings Credit (CTP)  
|96
|Requested payment method not used
|-
|38
|Payment Corporate Business Debit Savings (CTP) 
|97
|Clearing between partners
|-
|
|
|ZZZ
|Mutual Agreement
|}
|}
==Table 14==
{| class="wikitable" style="width: 100%;"
|+ Form to Payment Method 
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.7-2020 - 6.3.4.1. Payment methods: cbc:PaymentMeans/ID
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Meaning
|- valign="center"
|-
|1
|Cash
|-
|2
|Credit
|}
|}
==Table 15==
{| class="wikitable" style="width: 100%;"
|+ Terms of delivery (INCOTERMS)
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.7-2020 - 6.3.6. Terms of delivery (INCOTERMS): …/cbc:LossRiskResponsibilityCode
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Meaning
|- valign="center"
|-
|CFR	
|Cost & Freight
|-
|CIF	
|Cost, freight and insurance
|-
|CIP	
|Transport and Insurance Paid to
|-
|CPT	
|Carriage Paid To
|-
|DAP	
|Delivered to Place
|-
|DAT	
|Delivered at Terminal
|-
|DDP	
|Delivered Duty Paid
|-
|EXW	
|In Factory
|-
|FAS	
|Free alongside ship
|-
|FCA	
|Freight Carrier
|-
|FOB	
|Free on board
|}
|}
==Table 16==
{| class="wikitable" style="width: 100%;"
|+ Departments (ISO 3166-2:CO)
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.7-2020 - 6.4.2. Departments (ISO 3166-2:CO): cbc:CountrySubentity, cbc:CountrySubentityCode
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Name
! style="color:white;background:#2F5496; text-align:center;"|ISO code
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Name
! style="color:white;background:#2F5496; text-align:center;"|ISO code
|- valign="center"
|-
|91
|Amazonas
|AMA
|41
|Huila
|HUI
|-
|05
|Antioquia
|ANT
|44
|La Guajira
|LAG
|-
|81
|Arauca
|ARA
|47
|Magdalena
|MAG
|-
|08
|Atlántico
|ATL
|50
|Meta
|MET
|-
|11
|Bogotá
|DC
|52
|Nariño
|NAR
|-
|13
|Bolívar
|BOL
|54
|Norte de Santander
|NSA
|-
|15
|Boyacá
|BOY
|86
|Putumayo
|PUT
|-
|17
|Caldas
|CAL
|63
|Quindío
|QUI
|-
|18
|Caquetá
|CAQ
|66
|Risaralda
|RIS
|-
|85
|Casanare
|CAS
|88
|San Andrés y Providencia
|SAP
|-
|19
|Cauca
|CAU
|68
|Santander
|SAN
|-
|20
|Cesar
|CES
|70
|Sucre
|SUC
|-
|27
|Chocó
|CHO
|73
|Tolima
|TOL
|-
|23
|Córdoba
|COR
|76
|Valle del Cauca
|VAC
|-
|25
|Cundinamarca
|CUN
|97
|Vaupés
|VAU
|-
|94
|Guainía
|GUA
|99
|Vichada
|VID
|-
|95
|Guaviare
|GUV
|
|
|
|}
|}
==Table 17==
{| class="wikitable" style="width: 100%;"
|+ Tax responsibilities 
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.7-2020 - 6.2.7. Tax responsibilities: cbc:TaxLevelCode
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Meaning
|- valign="center"
|-
|0-13	
|Major contributor
|-
|0-15	
|Self-Locking
|-
|0-23	
|Sales tax withholding agent
|-
|0-47	
|Simple Taxation System – SIMPLE
|-
|R-99-PN	
|Does not apply - Others
|}
|}
==Table 18==
{| class="wikitable" style="width: 100%;"
|+ tax details
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.7-2020 - 6.2.2. Taxes: cac:TaxScheme/ID, cac:TaxScheme/Name
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Codigo
! style="color:white;background:#2F5496; text-align:center;"|Meaning
|- valign="center"
|-
|01
|IVA
|-
|04
|INC
|-
|ZA
|IVA e INC
|-
|ZZ
|Does not apply 
|}
|}
==Table 19==
{| class="wikitable" style="width: 100%;"
|+ Municipality
|- valign="center"
|-style="text-align:center;"
|colspan="2"|Anex 1.7-2020 - 6.4.3. Municipality: cbc:CityName
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code Department
! style="color:white;background:#2F5496; text-align:center;"|Code Municipal
! style="color:white;background:#2F5496; text-align:center;"|Name Department
! style="color:white;background:#2F5496; text-align:center;"|Name Municipal
|- valign="center"
|-
|05
|05044
|Antioquia
|ANZÁ
|-
|05
|05045
|Antioquia
|APARTADÓ
|-
|05
|05051
|Antioquia
|ARBOLETES
|-
|05
|05055
|Antioquia
|ARGELIA
|-
|05
|05059
|Antioquia
|ARMENIA
|-
|05
|05079
|Antioquia
|BARBOSA
|-
|05
|05086
|Antioquia
|BELMIRA
|-
|05
|05088
|Antioquia
|BELLO
|-
|05
|05091
|Antioquia
|BETANIA
|-
|05
|05093
|Antioquia
|BETULIA
|-
|05
|05101
|Antioquia
|CIUDAD BOLÍVAR
|-
|05
|05107
|Antioquia
|BRICEÑO
|-
|05
|05113
|Antioquia
|BURITICÁ
|-
|05
|05120
|Antioquia
|CÁCERES
|-
|05
|05125
|Antioquia
|CAICEDO
|-
|05
|05129
|Antioquia
|CALDAS
|-
|05
|05134
|Antioquia
|CAMPAMENTO
|-
|05
|05138
|Antioquia
|CAÑASGORDAS
|-
|05
|05142
|Antioquia
|CARACOLÍ
|-
|05
|05145
|Antioquia
|CARAMANTA
|-
|05
|05147
|Antioquia
|CAREPA
|-
|05
|05148
|Antioquia
|EL CARMEN DE VIBORAL
|-
|05
|05150
|Antioquia
|CAROLINA
|-
|05
|05154
|Antioquia
|CAUCASIA
|-
|05
|05172
|Antioquia
|CHIGORODÓ
|}
|}
'''@IMPORTANT:''' This catalog ''' municipalities''' is more extensive, for more information refer to the section of the corresponding Annex.
==Table 20==
{| class="wikitable" style="width: 100%;"
|+ Postal zone
|- valign="center"
|colspan="2"|Anex 1.7-2020 - 6.4.4. Reference to other documents cbc:PostalZone <br>
In Colombia, the postal code consists of 6 digits (example: 578986) that initially indicate the geographical position, followed by the routing and finally the one that locates us within the postal area, as follows:

'''National Departments'''<br>
The first two digits represent the national departments, using the current Dane coding. Codes less than 10 must start with a leading zero.

'''Departmental routing postal zones''' <br>
The third and fourth position define the routing postal zones to facilitate the classification through the Postal Code: 00 is reserved for the capital of the department. From 01 to 89, each department can be divided into up to 89 postal routing zones.

'''Postal district by municipality or locality''' <br>
The last two positions of the National Postal Code allow one hundred postal districts to be assigned to each of the ten postal zones created in each department. That is, up to a thousand different districts can be assigned in each department, for a total of thirty-three thousand at the national level.
|}
<span style="color:#FF0000;"><b>@IMPORTANT: </b></span>For more information, refer to the corresponding Annex section.
==Table 21==
{| class="wikitable" style="width: 100%;"
|+Reference to non-tax documents
|- valign="center"
|colspan="2"|'''Anex 1.8 - 13.1.4. Reference to non-tax documents: cbc:DocumentTypeCode''' <br>
This element refers to the'''xpath /Invoice/cac:AdditionalDocumentReference/cbc: DocumentTypeCode'''. These documents represent commercial and mercantile actions that protect or support transactions related to this electronic document.

The XML electronic documents adopted by the DIAN should not be included in this fragment since these documents do not contain the standard identifications such as CUFE or CUDE.

As it is a delivery order, the '''OrderReference''', element group must be used. When reporting more than one, the AdditionalDocumentReference group must be available.

This field of this group of information is optional to reference commercial issues at the will of the electronic biller, therefore, the codes are assigned by it.
|}

<center>'''TABLES OF CODES FOR THE ISSUANCE OF DOCUMENTS IN THE HEALTH SECTOR'''</center>
==Table 22==
{| class="wikitable" style="width: 100%;"
|+  Identification Document Type- Health Sector
|- valign="center"
|-style="text-align:center;"
|colspan="2"|
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Abv
! style="color:white;background:#2F5496; text-align:center;"|Type of Identification Document
|- valign="center"
|-
|CC
|Citizenship card
|-
|CE
|Immigration Certificate
|-
|CD
|Diplomatic ID
|-
|PA
|Passport
|-
|SC
|Safe conduct
|-
|PE
|special stay permit
|-
|RC
|Civil registration of birth
|-
|TI
|Identity Card
|-
|CN
|Live birth certificate
|-
|AS
|Adult Unidentified
|-
|MS
|Unidentified Minor
|-
|DE
|Foreign Document
|-
|SI
|Without Identification
|}
|}
==Table 23==
{| class="wikitable" style="width: 100%;"
|+ User Type - Health Sector
|- valign="center"
|-style="text-align:center;"
|colspan="2"|
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|User type
|- valign="center"
|-
|01
|Contributing taxpayer
|-
|02
|Contributory beneficiary
|-
|03
|Additional contributory
|-
|04
|Subsidised
|-
|05
|Not regim
|-
|06
|Special or Contributing Exception
|-
|07
|Special or Exception beneficiary
|-
|08
|Individual
|-
|09
|Policyholder/Protected ARL
|-
|10
|Policyholder/Protected SOAT
|-
|11
|Policy holder/Protected voluntary health plans
|}
|}
==Table 24==
{| class="wikitable" style="width: 100%;"
|+ Hiring Modalities - Health Sector
|- valign="center"
|-style="text-align:center;"
|colspan="2"|
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Hiring Modalities
|- valign="center"
|-
|01
|Package / Basket / Comprehensive Health Set
|-
|02
|Diagnosis-related Groups
|-
|03
|Comprehensive by risk group
|-
|04
|Payment by contact by specialty
|-
|05
|Payment per scenario of care
|-
|06
|Payment per service type
|-
|07
|Prospective global payment per episode
|-
|08
|Global prospective payment by risk group
|-
|09
|Prospective lump sum payment by specialty
|-
|10
|Prospective global payment by level of complexity
|-
|11
|Capacitation
|-
|12
|For service
|}
|}
==Table 25==
{| class="wikitable" style="width: 100%;"
|+ CService coverage or plan - Health Sector
|- valign="center"
|-style="text-align:center;"
|colspan="2"|
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Service coverage or plan
|- valign="center"
|-
|01
|Health benefit plan financed by UPC
|-
|02
|Maximum budget
|-
|03
|EPS/EOC premium, uninsured SOAT
|-
|04
|Coverage SOAT Policy
|-
|05
|ARL cover
|-
|06
|ADRES coverage
|-
|07
|Public Health Cover
|-
|08
|Coverage of the territorial entity, supply resources
|-
|09
|Emergencies migrant population
|-
|10
|Supplemental health plan
|-
|11
|Prepaid Medical Plan
|-
|12
|Other health policies
|-
|13
|Special Regime Coverage or Exception
|-
|14
|National Health Fund Coverage for Persons Deprived of Liberty
|-
|15
|Private
|}
|}
==Table 26==
{| class="wikitable" style="width: 100%;"
|+ Collection Concepts
|- valign="center"
|-style="text-align:center;"
|colspan="2"|
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Description
|- valign="center"
|-
|16
|Copayment
|-
|17
|Moderator Fee
|-
|18
|Recovery Fee
|-
|19
|Shared plans in voluntary health plans
|}
|}
==Table 27==
{| class="wikitable" style="width: 100%;"
|+ Scenario Types
|- valign="center"
|-style="text-align:center;"
|colspan="2"|
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Code
! style="color:white;background:#2F5496; text-align:center;"|Description
|- valign="center"
|-
|1
|Record of the Concept of collection to the patient
|-
|2
|Registration of the concept of accreditation to the EPS
|-
|3
|Record of operations without accreditation to the EPS
|-
|4
|Issuance of FEL without prior collection
|-
|5
|Including in a FEL the value to be credited for the collection
|}
|}
==Table 28==
{| class="wikitable" style="width: 100%;"
|+ Additional Data Fields
|- valign="center"
|-style="text-align:center;"
|colspan="2"|
{| class="wikitable" style="width: 100%;" style="margin: auto;"
! style="color:white;background:#2F5496; text-align:center;"|Name
! style="color:white;background:#2F5496; text-align:center;"|Label
! style="color:white;background:#2F5496; text-align:center;"|Description
|- valign="center"
|-
|1
|CODIGO_PRESTADOR
|Code assigned in the General System of Social Security in Health (SGSSS) to health service providers that are in the Special Registry of Health Service Providers (REPS) or the Code assigned by the Ministry of Health and Social Protection for public health laboratories.
|-
|2
|TIPO_DOCUMENTO_IDENTIFICACION
|User identification type
:[[Tables of property codes for issuance of documents - Direct Integration Manual Index#Table 22|Table 22]]
|-
|3
|NUMERO_DOCUMENTO_IDENTIFICACION
|Registration of the identification document number according to the type of user document
|-
|4
|PRIMER_APELLIDO
|First surname of the user as specified in the identification document.
|-
|5
|SEGUNDO_APELLIDO
|Second surname of the user as specified in the identification document.
|-
|6
|PRIMER_NOMBRE
|User's first name as specified in the identification document
|-
|7
|SEGUNDO_NOMBRE
|Second name of the user according to what is specified in the identification document
|-
|8
|TIPO_USUARIO
|Registration of the person's affiliation condition or relationship with the coverage or benefit plan. 
:[[Property code tables for document issuance - Direct Integration Manual Index#Table 23|Table 23]]
|-
|9
|MODALIDAD_CONTRATACION
|Registration of the contracting and payment modality agreed to be billed. Mandatory. 
:[[Property code tables for document issuance - Direct Integration Manual Index#Table 24|Table 24]]
|
|-
|10
|COBERTURA_PLAN_BENEFICIOS
|Registration of the entity responsible for financing the coverage or benefit plan. Mandatory. 
:[[Property code tables for document issuance - Direct Integration Manual Index#Table 25|Table 25]]
|-
|11
|NUMERO_AUTORIZACION
|Compulsory: When there is the response authorization number or the request number, as the case may be. For emergencies, SOAT and ARL are empty
|-
|12
|NUMERO_MIPRES
|Assigned by MIPRES
|-
|13
|NUMERO_ENTREGA_MIPRES
|Assigned by MIPRES
|-
|14
|NUMERO_CONTRATO
|Number of the billing contract
|-
|15
|NUMERO_POLIZA
|Number of SOAT policy or voluntary health plans. Mandatory: When it comes to SOAT services or voluntary health plans. Diligence when it comes to care for a traffic accident or for care as a private individual for a health policy
|-
|16
|COPAGO
|Value actually paid by the user and collected by the service provider
|-
|17
|CUOTA_MODERADORA
|Value actually paid by the user and collected by the service provider
|-
|18
|CUOTA_RECUPERACION
|Value actually paid by the user and collected by the service provider
|-
|19
|PAGOS_COMPARTIDOS
|Value actually paid by the user and collected by the service provider
|}
|}
