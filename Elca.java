<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tem="http://tempuri.org/" xmlns:arr="http://schemas.microsoft.com/2003/10/Serialization/Arrays">
	<soapenv:Header/>
	<soapenv:Body>
		<tem:Enviar>
			<tem:tokenEmpresa>tokenEmpresa(Provided by TFHKA)</tem:tokenEmpresa>
			<tem:tokenPassword>tokenPassword(Provided by TFHKA)</tem:tokenPassword>
			<tem:factura xmlns="http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object">
				<cantidadDecimales>2</cantidadDecimales><!--N|1-->
				<cliente>
					<destinatario>
						<Destinatario>
							<canalDeEntrega>0</canalDeEntrega>
							<email>
								<arr:string>email1@thefactoryhka.com</arr:string><!--Must be a valid email - For example: user@elca.com-->
								<arr:string>email2@thefactoryhka.com</arr:string><!--Must be a valid email - For example: user@elca.com-->
							</email>
						</Destinatario>
					</destinatario>
					<detallesTributarios>
						<Tributos>
							<codigoImpuesto>ZY</codigoImpuesto><!--AN|2-->
						</Tributos>
					</detallesTributarios>
					<direccionCliente>
						<ciudad>BOGOTÁ, D.C.</ciudad><!--AN|…50-->
						<codigoDepartamento>11</codigoDepartamento><!--AN|…5-->
						<departamento>Bogotá</departamento><!--AN|…50-->
						<direccion>Direccion Fisica del Receptor</direccion><!--AN|…100-->
						<lenguaje>es</lenguaje><!--A|2 ISO 639-1-->
						<municipio>11001</municipio><!--AN|..50-->
						<pais>CO</pais><!--A|2-->
					</direccionCliente>
					<direccionFiscal>
						<ciudad>BOGOTÁ, D.C.</ciudad><!--AN|…50-->
						<codigoDepartamento>11</codigoDepartamento><!--AN|…5-->
						<departamento>Bogotá</departamento><!--AN|…50-->
						<direccion>Direccion Fiscal del Receptor</direccion><!--AN|…100-->
						<lenguaje>es</lenguaje><!--A|2 ISO 639-1-->
						<municipio>11001</municipio><!--AN|..50-->
						<pais>CO</pais><!--A|2-->
					</direccionFiscal>
					<email>emailReceptor@thefactoryhka.com</email><!--AN|..50-->
					<informacionLegalCliente>
						<nombreRegistroRUT>Razon Social Receptor</nombreRegistroRUT><!--AN|..450-->
						<numeroIdentificacion>901041710</numeroIdentificacion><!--AN|..12-->
						<numeroIdentificacionDV>5</numeroIdentificacionDV><!--N|..2-->
						<tipoIdentificacion>31</tipoIdentificacion><!--N|2-->
					</informacionLegalCliente>
					<nombreRazonSocial>Razon Social Receptor</nombreRazonSocial><!--AN|..450-->
					<notificar>SI</notificar><!--AN|2-->
					<numeroDocumento>901041710</numeroDocumento><!--AN|..12-->
					<numeroIdentificacionDV>5</numeroIdentificacionDV><!--N|..2-->
					<responsabilidadesRut>
						<Obligaciones>
							<obligaciones>R-99-PN</obligaciones><!--AN|7-->
						</Obligaciones>
					</responsabilidadesRut>
					<tipoIdentificacion>31</tipoIdentificacion><!--N|2-->
					<tipoPersona>1</tipoPersona><!--N|1-->
				</cliente>
				<consecutivoDocumento>CONSECUTIVE</consecutivoDocumento><!--AN..20-->
				<detalleDeFactura>
					<FacturaDetalle>
                    <cantidadReal>1.00</cantidadReal><!--N|..6-->
                    <cantidadRealUnidadMedida>WSD</cantidadRealUnidadMedida><!--AN|..6-->
                    <cantidadUnidades>1.00</cantidadUnidades><!--N|..6-->             
                    <codigoProducto>000001</codigoProducto>	<!--AN|..50-->	
                    <codigoTipoPrecio>01</codigoTipoPrecio>							
                    <descripcion>Product 000001</descripcion><!--AN|..300-->
                    <estandarCodigo>999</estandarCodigo><!--AN-->
                    <estandarCodigoProducto>000001</estandarCodigoProducto><!--AN-->
                    <impuestosDetalles>
                        <FacturaImpuestos>
                        <baseImponibleTOTALImp>1003.00</baseImponibleTOTALImp><!--Ent: N|..15 - Dec: N|0..6-->
                            <codigoTOTALImp>01</codigoTOTALImp<!--AN|2-->
                            <controlInterno/><!--N|1-->
                            <porcentajeTOTALImp>19.00</porcentajeTOTALImp><!--Ent: N|..2 - Dec: N|2*-->
                            <unidadMedida/><!--AN|..5-->
                            <unidadMedidaTributo/><!--Ent: N|..2 - Dec: N|2-->
                            <valorTOTALImp>190.57</valorTOTALImp><!--Ent: N|..15 - Dec: N|0..6-->
                            <valorTributoUnidad/><!--Ent: N|..15 - Dec: N|0..6-->
							</FacturaImpuestos>
						</impuestosDetalles>
						<impuestosTotales>
							<ImpuestosTotales>
                            <codigoTOTALImp>01</codigoTOTALImp><!--AN|2-->
                            <montoTotal>190.57</montoTotal><!--Ent: N|..15 - Dec: N|0..6-->
                        </ImpuestosTotales>
                    </impuestosTotales>
                    <muestraGratis>1</muestraGratis><!--N|1-->
                        <precioReferencia>1003.00</precioReferencia><!--Ent: N|..15 - Dec: N|0..6-->
						<precioTotal>0.00</precioTotal><!--Ent: N|..15 - Dec: N|0..6-->
						<precioTotalSinImpuestos>0.00</precioTotalSinImpuestos><!--Ent: N|..15 - Dec: N|0..6-->
						<precioVentaUnitario>0.00</precioVentaUnitario><!--Ent: N|..15 - Dec: N|0..6-->
						<secuencia>1</secuencia><!--AN|..4-->
						<unidadMedida>WSD</unidadMedida><!--AN|..3-->
					</FacturaDetalle>
				</detalleDeFactura>
				<fechaEmision>2022-03-25 00:00:00</fechaEmision><!--AN|19-->
				<impuestosGenerales>
					<FacturaImpuestos>
						<baseImponibleTOTALImp>1003.00</baseImponibleTOTALImp><!--Ent: N|..15 - Dec: N|0..6-->
						<codigoTOTALImp>01</codigoTOTALImp><!--AN|2-->
						<porcentajeTOTALImp>19.00</porcentajeTOTALImp><!--Ent: N|..2 - Dec: N|2*-->
						<unidadMedida>WSD</unidadMedida><!--AN|..5	-->
						<valorTOTALImp>190.57</valorTOTALImp><!--Ent: N|..15 - Dec: N|0..6-->
                        </FacturaImpuestos>
				</impuestosGenerales>
				<impuestosTotales>
					<ImpuestosTotales>
                    <codigoTOTALImp>01</codigoTOTALImp><!--AN|2-->
                    <montoTotal>190.57</montoTotal><!--Ent: N|..15 - Dec: N|0..6-->
                </ImpuestosTotales>
            </impuestosTotales>
            <mediosDePago>
                <MediosDePago>
                    <medioPago>10</medioPago><!--AN|..2-->
                    <metodoDePago>1</metodoDePago><!--AN|..2-->
                    <numeroDeReferencia>01</numeroDeReferencia><!--AN|..200-->
                </MediosDePago>
            </mediosDePago>
            <moneda>COP</moneda><!--AN|3-->
            <rangoNumeracion>PREFIX-RANGE FROM</rangoNumeracion><!--AN..20-->
            <redondeoAplicado>0.00</redondeoAplicado>
            <tipoDocumento>01</tipoDocumento><!--N|2-->
            <tipoOperacion>10</tipoOperacion><!--AN|..4-->
            <totalBaseImponible>1003.00</totalBaseImponible><!--Ent: N|..15 - Dec: N|0..6-->
            <totalBrutoConImpuesto>190.57</totalBrutoConImpuesto><!--Ent: N|..15 - Dec: N|0..6-->
				<totalMonto>190.57</totalMonto><!--Ent: N|..15 - Dec: N|0..6-->
				<totalProductos>1</totalProductos><!--AN|..5-->
				<totalSinImpuestos>0.00</totalSinImpuestos><!--Ent: N|..15 - Dec: N|0..6-->
			</tem:factura>
			<tem:adjuntos>0</tem:adjuntos><!--AN|..2-->
		</tem:Enviar>
	</soapenv:Body>
</soapenv:Envelope>