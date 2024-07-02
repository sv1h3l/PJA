
package cz.zcu.stag_ws;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.zcu.stag_ws package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _BlokInfo_QNAME = new QName("http://stag-ws.zcu.cz/", "blokInfo");
    private static final QName _BlokInfoList_QNAME = new QName("http://stag-ws.zcu.cz/", "blokInfoList");
    private static final QName _GetBlokInfo_QNAME = new QName("http://stag-ws.zcu.cz/", "getBlokInfo");
    private static final QName _GetBlokInfoResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getBlokInfoResponse");
    private static final QName _GetBlokyPlanu_QNAME = new QName("http://stag-ws.zcu.cz/", "getBlokyPlanu");
    private static final QName _GetBlokyPlanuResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getBlokyPlanuResponse");
    private static final QName _GetBlokySegmentu_QNAME = new QName("http://stag-ws.zcu.cz/", "getBlokySegmentu");
    private static final QName _GetBlokySegmentuResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getBlokySegmentuResponse");
    private static final QName _GetOblastiVzdelavaniProgramu_QNAME = new QName("http://stag-ws.zcu.cz/", "getOblastiVzdelavaniProgramu");
    private static final QName _GetOblastiVzdelavaniProgramuResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getOblastiVzdelavaniProgramuResponse");
    private static final QName _GetOborInfo_QNAME = new QName("http://stag-ws.zcu.cz/", "getOborInfo");
    private static final QName _GetOborInfoResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getOborInfoResponse");
    private static final QName _GetOboryQRAMInfo_QNAME = new QName("http://stag-ws.zcu.cz/", "getOboryQRAMInfo");
    private static final QName _GetOboryQRAMInfoResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getOboryQRAMInfoResponse");
    private static final QName _GetOboryStudijnihoProgramu_QNAME = new QName("http://stag-ws.zcu.cz/", "getOboryStudijnihoProgramu");
    private static final QName _GetOboryStudijnihoProgramuResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getOboryStudijnihoProgramuResponse");
    private static final QName _GetPlanInfo_QNAME = new QName("http://stag-ws.zcu.cz/", "getPlanInfo");
    private static final QName _GetPlanInfoResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getPlanInfoResponse");
    private static final QName _GetPlanyOboru_QNAME = new QName("http://stag-ws.zcu.cz/", "getPlanyOboru");
    private static final QName _GetPlanyOboruResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getPlanyOboruResponse");
    private static final QName _GetPlanyStudenta_QNAME = new QName("http://stag-ws.zcu.cz/", "getPlanyStudenta");
    private static final QName _GetPlanyStudentaResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getPlanyStudentaResponse");
    private static final QName _GetSegmentInfo_QNAME = new QName("http://stag-ws.zcu.cz/", "getSegmentInfo");
    private static final QName _GetSegmentInfoResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getSegmentInfoResponse");
    private static final QName _GetSegmentyPlanu_QNAME = new QName("http://stag-ws.zcu.cz/", "getSegmentyPlanu");
    private static final QName _GetSegmentyPlanuResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getSegmentyPlanuResponse");
    private static final QName _GetStudijniProgramInfo_QNAME = new QName("http://stag-ws.zcu.cz/", "getStudijniProgramInfo");
    private static final QName _GetStudijniProgramInfoResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getStudijniProgramInfoResponse");
    private static final QName _GetStudijniProgramy_QNAME = new QName("http://stag-ws.zcu.cz/", "getStudijniProgramy");
    private static final QName _GetStudijniProgramyResponse_QNAME = new QName("http://stag-ws.zcu.cz/", "getStudijniProgramyResponse");
    private static final QName _OborInfo_QNAME = new QName("http://stag-ws.zcu.cz/", "oborInfo");
    private static final QName _OborInfoList_QNAME = new QName("http://stag-ws.zcu.cz/", "oborInfoList");
    private static final QName _OborQRAMInfo_QNAME = new QName("http://stag-ws.zcu.cz/", "oborQRAMInfo");
    private static final QName _OborQRAMInfoList_QNAME = new QName("http://stag-ws.zcu.cz/", "oborQRAMInfoList");
    private static final QName _PlanInfo_QNAME = new QName("http://stag-ws.zcu.cz/", "planInfo");
    private static final QName _PlanInfoList_QNAME = new QName("http://stag-ws.zcu.cz/", "planInfoList");
    private static final QName _ProgramInfo_QNAME = new QName("http://stag-ws.zcu.cz/", "programInfo");
    private static final QName _ProgramInfoList_QNAME = new QName("http://stag-ws.zcu.cz/", "programInfoList");
    private static final QName _ProgramOblVzdel_QNAME = new QName("http://stag-ws.zcu.cz/", "programOblVzdel");
    private static final QName _ProgramOblVzdelList_QNAME = new QName("http://stag-ws.zcu.cz/", "programOblVzdelList");
    private static final QName _SegmentInfo_QNAME = new QName("http://stag-ws.zcu.cz/", "segmentInfo");
    private static final QName _SegmentInfoList_QNAME = new QName("http://stag-ws.zcu.cz/", "segmentInfoList");
    private static final QName _GetStudijniProgramyFakulta_QNAME = new QName("", "fakulta");
    private static final QName _GetStudijniProgramyRok_QNAME = new QName("", "rok");
    private static final QName _GetStudijniProgramyKod_QNAME = new QName("", "kod");
    private static final QName _GetStudijniProgramyForma_QNAME = new QName("", "forma");
    private static final QName _GetStudijniProgramyTyp_QNAME = new QName("", "typ");
    private static final QName _GetStudijniProgramyJazyk_QNAME = new QName("", "jazyk");
    private static final QName _GetStudijniProgramyProfil_QNAME = new QName("", "profil");
    private static final QName _GetStudijniProgramyPouzePlatne_QNAME = new QName("", "pouzePlatne");
    private static final QName _GetStudijniProgramyLang_QNAME = new QName("", "lang");
    private static final QName _GetOboryQRAMInfoOborIdno_QNAME = new QName("", "oborIdno");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.zcu.stag_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BlokInfoType }
     * 
     * @return
     *     the new instance of {@link BlokInfoType }
     */
    public BlokInfoType createBlokInfoType() {
        return new BlokInfoType();
    }

    /**
     * Create an instance of {@link BlokInfoListType }
     * 
     * @return
     *     the new instance of {@link BlokInfoListType }
     */
    public BlokInfoListType createBlokInfoListType() {
        return new BlokInfoListType();
    }

    /**
     * Create an instance of {@link GetBlokInfo }
     * 
     * @return
     *     the new instance of {@link GetBlokInfo }
     */
    public GetBlokInfo createGetBlokInfo() {
        return new GetBlokInfo();
    }

    /**
     * Create an instance of {@link GetBlokInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetBlokInfoResponse }
     */
    public GetBlokInfoResponse createGetBlokInfoResponse() {
        return new GetBlokInfoResponse();
    }

    /**
     * Create an instance of {@link GetBlokyPlanu }
     * 
     * @return
     *     the new instance of {@link GetBlokyPlanu }
     */
    public GetBlokyPlanu createGetBlokyPlanu() {
        return new GetBlokyPlanu();
    }

    /**
     * Create an instance of {@link GetBlokyPlanuResponse }
     * 
     * @return
     *     the new instance of {@link GetBlokyPlanuResponse }
     */
    public GetBlokyPlanuResponse createGetBlokyPlanuResponse() {
        return new GetBlokyPlanuResponse();
    }

    /**
     * Create an instance of {@link GetBlokySegmentu }
     * 
     * @return
     *     the new instance of {@link GetBlokySegmentu }
     */
    public GetBlokySegmentu createGetBlokySegmentu() {
        return new GetBlokySegmentu();
    }

    /**
     * Create an instance of {@link GetBlokySegmentuResponse }
     * 
     * @return
     *     the new instance of {@link GetBlokySegmentuResponse }
     */
    public GetBlokySegmentuResponse createGetBlokySegmentuResponse() {
        return new GetBlokySegmentuResponse();
    }

    /**
     * Create an instance of {@link GetOblastiVzdelavaniProgramu }
     * 
     * @return
     *     the new instance of {@link GetOblastiVzdelavaniProgramu }
     */
    public GetOblastiVzdelavaniProgramu createGetOblastiVzdelavaniProgramu() {
        return new GetOblastiVzdelavaniProgramu();
    }

    /**
     * Create an instance of {@link GetOblastiVzdelavaniProgramuResponse }
     * 
     * @return
     *     the new instance of {@link GetOblastiVzdelavaniProgramuResponse }
     */
    public GetOblastiVzdelavaniProgramuResponse createGetOblastiVzdelavaniProgramuResponse() {
        return new GetOblastiVzdelavaniProgramuResponse();
    }

    /**
     * Create an instance of {@link GetOborInfo }
     * 
     * @return
     *     the new instance of {@link GetOborInfo }
     */
    public GetOborInfo createGetOborInfo() {
        return new GetOborInfo();
    }

    /**
     * Create an instance of {@link GetOborInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetOborInfoResponse }
     */
    public GetOborInfoResponse createGetOborInfoResponse() {
        return new GetOborInfoResponse();
    }

    /**
     * Create an instance of {@link GetOboryQRAMInfo }
     * 
     * @return
     *     the new instance of {@link GetOboryQRAMInfo }
     */
    public GetOboryQRAMInfo createGetOboryQRAMInfo() {
        return new GetOboryQRAMInfo();
    }

    /**
     * Create an instance of {@link GetOboryQRAMInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetOboryQRAMInfoResponse }
     */
    public GetOboryQRAMInfoResponse createGetOboryQRAMInfoResponse() {
        return new GetOboryQRAMInfoResponse();
    }

    /**
     * Create an instance of {@link GetOboryStudijnihoProgramu }
     * 
     * @return
     *     the new instance of {@link GetOboryStudijnihoProgramu }
     */
    public GetOboryStudijnihoProgramu createGetOboryStudijnihoProgramu() {
        return new GetOboryStudijnihoProgramu();
    }

    /**
     * Create an instance of {@link GetOboryStudijnihoProgramuResponse }
     * 
     * @return
     *     the new instance of {@link GetOboryStudijnihoProgramuResponse }
     */
    public GetOboryStudijnihoProgramuResponse createGetOboryStudijnihoProgramuResponse() {
        return new GetOboryStudijnihoProgramuResponse();
    }

    /**
     * Create an instance of {@link GetPlanInfo }
     * 
     * @return
     *     the new instance of {@link GetPlanInfo }
     */
    public GetPlanInfo createGetPlanInfo() {
        return new GetPlanInfo();
    }

    /**
     * Create an instance of {@link GetPlanInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetPlanInfoResponse }
     */
    public GetPlanInfoResponse createGetPlanInfoResponse() {
        return new GetPlanInfoResponse();
    }

    /**
     * Create an instance of {@link GetPlanyOboru }
     * 
     * @return
     *     the new instance of {@link GetPlanyOboru }
     */
    public GetPlanyOboru createGetPlanyOboru() {
        return new GetPlanyOboru();
    }

    /**
     * Create an instance of {@link GetPlanyOboruResponse }
     * 
     * @return
     *     the new instance of {@link GetPlanyOboruResponse }
     */
    public GetPlanyOboruResponse createGetPlanyOboruResponse() {
        return new GetPlanyOboruResponse();
    }

    /**
     * Create an instance of {@link GetPlanyStudenta }
     * 
     * @return
     *     the new instance of {@link GetPlanyStudenta }
     */
    public GetPlanyStudenta createGetPlanyStudenta() {
        return new GetPlanyStudenta();
    }

    /**
     * Create an instance of {@link GetPlanyStudentaResponse }
     * 
     * @return
     *     the new instance of {@link GetPlanyStudentaResponse }
     */
    public GetPlanyStudentaResponse createGetPlanyStudentaResponse() {
        return new GetPlanyStudentaResponse();
    }

    /**
     * Create an instance of {@link GetSegmentInfo }
     * 
     * @return
     *     the new instance of {@link GetSegmentInfo }
     */
    public GetSegmentInfo createGetSegmentInfo() {
        return new GetSegmentInfo();
    }

    /**
     * Create an instance of {@link GetSegmentInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetSegmentInfoResponse }
     */
    public GetSegmentInfoResponse createGetSegmentInfoResponse() {
        return new GetSegmentInfoResponse();
    }

    /**
     * Create an instance of {@link GetSegmentyPlanu }
     * 
     * @return
     *     the new instance of {@link GetSegmentyPlanu }
     */
    public GetSegmentyPlanu createGetSegmentyPlanu() {
        return new GetSegmentyPlanu();
    }

    /**
     * Create an instance of {@link GetSegmentyPlanuResponse }
     * 
     * @return
     *     the new instance of {@link GetSegmentyPlanuResponse }
     */
    public GetSegmentyPlanuResponse createGetSegmentyPlanuResponse() {
        return new GetSegmentyPlanuResponse();
    }

    /**
     * Create an instance of {@link GetStudijniProgramInfo }
     * 
     * @return
     *     the new instance of {@link GetStudijniProgramInfo }
     */
    public GetStudijniProgramInfo createGetStudijniProgramInfo() {
        return new GetStudijniProgramInfo();
    }

    /**
     * Create an instance of {@link GetStudijniProgramInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetStudijniProgramInfoResponse }
     */
    public GetStudijniProgramInfoResponse createGetStudijniProgramInfoResponse() {
        return new GetStudijniProgramInfoResponse();
    }

    /**
     * Create an instance of {@link GetStudijniProgramy }
     * 
     * @return
     *     the new instance of {@link GetStudijniProgramy }
     */
    public GetStudijniProgramy createGetStudijniProgramy() {
        return new GetStudijniProgramy();
    }

    /**
     * Create an instance of {@link GetStudijniProgramyResponse }
     * 
     * @return
     *     the new instance of {@link GetStudijniProgramyResponse }
     */
    public GetStudijniProgramyResponse createGetStudijniProgramyResponse() {
        return new GetStudijniProgramyResponse();
    }

    /**
     * Create an instance of {@link OborInfoType }
     * 
     * @return
     *     the new instance of {@link OborInfoType }
     */
    public OborInfoType createOborInfoType() {
        return new OborInfoType();
    }

    /**
     * Create an instance of {@link OborInfoListType }
     * 
     * @return
     *     the new instance of {@link OborInfoListType }
     */
    public OborInfoListType createOborInfoListType() {
        return new OborInfoListType();
    }

    /**
     * Create an instance of {@link OborQRAMInfoType }
     * 
     * @return
     *     the new instance of {@link OborQRAMInfoType }
     */
    public OborQRAMInfoType createOborQRAMInfoType() {
        return new OborQRAMInfoType();
    }

    /**
     * Create an instance of {@link OborQRAMInfoListType }
     * 
     * @return
     *     the new instance of {@link OborQRAMInfoListType }
     */
    public OborQRAMInfoListType createOborQRAMInfoListType() {
        return new OborQRAMInfoListType();
    }

    /**
     * Create an instance of {@link PlanInfoType }
     * 
     * @return
     *     the new instance of {@link PlanInfoType }
     */
    public PlanInfoType createPlanInfoType() {
        return new PlanInfoType();
    }

    /**
     * Create an instance of {@link PlanInfoListType }
     * 
     * @return
     *     the new instance of {@link PlanInfoListType }
     */
    public PlanInfoListType createPlanInfoListType() {
        return new PlanInfoListType();
    }

    /**
     * Create an instance of {@link ProgramInfoType }
     * 
     * @return
     *     the new instance of {@link ProgramInfoType }
     */
    public ProgramInfoType createProgramInfoType() {
        return new ProgramInfoType();
    }

    /**
     * Create an instance of {@link ProgramInfoListType }
     * 
     * @return
     *     the new instance of {@link ProgramInfoListType }
     */
    public ProgramInfoListType createProgramInfoListType() {
        return new ProgramInfoListType();
    }

    /**
     * Create an instance of {@link ProgramOblVzdelType }
     * 
     * @return
     *     the new instance of {@link ProgramOblVzdelType }
     */
    public ProgramOblVzdelType createProgramOblVzdelType() {
        return new ProgramOblVzdelType();
    }

    /**
     * Create an instance of {@link ProgramOblVzdelListType }
     * 
     * @return
     *     the new instance of {@link ProgramOblVzdelListType }
     */
    public ProgramOblVzdelListType createProgramOblVzdelListType() {
        return new ProgramOblVzdelListType();
    }

    /**
     * Create an instance of {@link SegmentInfoType }
     * 
     * @return
     *     the new instance of {@link SegmentInfoType }
     */
    public SegmentInfoType createSegmentInfoType() {
        return new SegmentInfoType();
    }

    /**
     * Create an instance of {@link SegmentInfoListType }
     * 
     * @return
     *     the new instance of {@link SegmentInfoListType }
     */
    public SegmentInfoListType createSegmentInfoListType() {
        return new SegmentInfoListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlokInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlokInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "blokInfo")
    public JAXBElement<BlokInfoType> createBlokInfo(BlokInfoType value) {
        return new JAXBElement<>(_BlokInfo_QNAME, BlokInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlokInfoListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlokInfoListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "blokInfoList")
    public JAXBElement<BlokInfoListType> createBlokInfoList(BlokInfoListType value) {
        return new JAXBElement<>(_BlokInfoList_QNAME, BlokInfoListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBlokInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBlokInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getBlokInfo")
    public JAXBElement<GetBlokInfo> createGetBlokInfo(GetBlokInfo value) {
        return new JAXBElement<>(_GetBlokInfo_QNAME, GetBlokInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBlokInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBlokInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getBlokInfoResponse")
    public JAXBElement<GetBlokInfoResponse> createGetBlokInfoResponse(GetBlokInfoResponse value) {
        return new JAXBElement<>(_GetBlokInfoResponse_QNAME, GetBlokInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBlokyPlanu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBlokyPlanu }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getBlokyPlanu")
    public JAXBElement<GetBlokyPlanu> createGetBlokyPlanu(GetBlokyPlanu value) {
        return new JAXBElement<>(_GetBlokyPlanu_QNAME, GetBlokyPlanu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBlokyPlanuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBlokyPlanuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getBlokyPlanuResponse")
    public JAXBElement<GetBlokyPlanuResponse> createGetBlokyPlanuResponse(GetBlokyPlanuResponse value) {
        return new JAXBElement<>(_GetBlokyPlanuResponse_QNAME, GetBlokyPlanuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBlokySegmentu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBlokySegmentu }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getBlokySegmentu")
    public JAXBElement<GetBlokySegmentu> createGetBlokySegmentu(GetBlokySegmentu value) {
        return new JAXBElement<>(_GetBlokySegmentu_QNAME, GetBlokySegmentu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBlokySegmentuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBlokySegmentuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getBlokySegmentuResponse")
    public JAXBElement<GetBlokySegmentuResponse> createGetBlokySegmentuResponse(GetBlokySegmentuResponse value) {
        return new JAXBElement<>(_GetBlokySegmentuResponse_QNAME, GetBlokySegmentuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOblastiVzdelavaniProgramu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOblastiVzdelavaniProgramu }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getOblastiVzdelavaniProgramu")
    public JAXBElement<GetOblastiVzdelavaniProgramu> createGetOblastiVzdelavaniProgramu(GetOblastiVzdelavaniProgramu value) {
        return new JAXBElement<>(_GetOblastiVzdelavaniProgramu_QNAME, GetOblastiVzdelavaniProgramu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOblastiVzdelavaniProgramuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOblastiVzdelavaniProgramuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getOblastiVzdelavaniProgramuResponse")
    public JAXBElement<GetOblastiVzdelavaniProgramuResponse> createGetOblastiVzdelavaniProgramuResponse(GetOblastiVzdelavaniProgramuResponse value) {
        return new JAXBElement<>(_GetOblastiVzdelavaniProgramuResponse_QNAME, GetOblastiVzdelavaniProgramuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOborInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOborInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getOborInfo")
    public JAXBElement<GetOborInfo> createGetOborInfo(GetOborInfo value) {
        return new JAXBElement<>(_GetOborInfo_QNAME, GetOborInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOborInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOborInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getOborInfoResponse")
    public JAXBElement<GetOborInfoResponse> createGetOborInfoResponse(GetOborInfoResponse value) {
        return new JAXBElement<>(_GetOborInfoResponse_QNAME, GetOborInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOboryQRAMInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOboryQRAMInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getOboryQRAMInfo")
    public JAXBElement<GetOboryQRAMInfo> createGetOboryQRAMInfo(GetOboryQRAMInfo value) {
        return new JAXBElement<>(_GetOboryQRAMInfo_QNAME, GetOboryQRAMInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOboryQRAMInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOboryQRAMInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getOboryQRAMInfoResponse")
    public JAXBElement<GetOboryQRAMInfoResponse> createGetOboryQRAMInfoResponse(GetOboryQRAMInfoResponse value) {
        return new JAXBElement<>(_GetOboryQRAMInfoResponse_QNAME, GetOboryQRAMInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOboryStudijnihoProgramu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOboryStudijnihoProgramu }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getOboryStudijnihoProgramu")
    public JAXBElement<GetOboryStudijnihoProgramu> createGetOboryStudijnihoProgramu(GetOboryStudijnihoProgramu value) {
        return new JAXBElement<>(_GetOboryStudijnihoProgramu_QNAME, GetOboryStudijnihoProgramu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOboryStudijnihoProgramuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOboryStudijnihoProgramuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getOboryStudijnihoProgramuResponse")
    public JAXBElement<GetOboryStudijnihoProgramuResponse> createGetOboryStudijnihoProgramuResponse(GetOboryStudijnihoProgramuResponse value) {
        return new JAXBElement<>(_GetOboryStudijnihoProgramuResponse_QNAME, GetOboryStudijnihoProgramuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlanInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPlanInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getPlanInfo")
    public JAXBElement<GetPlanInfo> createGetPlanInfo(GetPlanInfo value) {
        return new JAXBElement<>(_GetPlanInfo_QNAME, GetPlanInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlanInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPlanInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getPlanInfoResponse")
    public JAXBElement<GetPlanInfoResponse> createGetPlanInfoResponse(GetPlanInfoResponse value) {
        return new JAXBElement<>(_GetPlanInfoResponse_QNAME, GetPlanInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlanyOboru }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPlanyOboru }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getPlanyOboru")
    public JAXBElement<GetPlanyOboru> createGetPlanyOboru(GetPlanyOboru value) {
        return new JAXBElement<>(_GetPlanyOboru_QNAME, GetPlanyOboru.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlanyOboruResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPlanyOboruResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getPlanyOboruResponse")
    public JAXBElement<GetPlanyOboruResponse> createGetPlanyOboruResponse(GetPlanyOboruResponse value) {
        return new JAXBElement<>(_GetPlanyOboruResponse_QNAME, GetPlanyOboruResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlanyStudenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPlanyStudenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getPlanyStudenta")
    public JAXBElement<GetPlanyStudenta> createGetPlanyStudenta(GetPlanyStudenta value) {
        return new JAXBElement<>(_GetPlanyStudenta_QNAME, GetPlanyStudenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlanyStudentaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPlanyStudentaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getPlanyStudentaResponse")
    public JAXBElement<GetPlanyStudentaResponse> createGetPlanyStudentaResponse(GetPlanyStudentaResponse value) {
        return new JAXBElement<>(_GetPlanyStudentaResponse_QNAME, GetPlanyStudentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegmentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSegmentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getSegmentInfo")
    public JAXBElement<GetSegmentInfo> createGetSegmentInfo(GetSegmentInfo value) {
        return new JAXBElement<>(_GetSegmentInfo_QNAME, GetSegmentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegmentInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSegmentInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getSegmentInfoResponse")
    public JAXBElement<GetSegmentInfoResponse> createGetSegmentInfoResponse(GetSegmentInfoResponse value) {
        return new JAXBElement<>(_GetSegmentInfoResponse_QNAME, GetSegmentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegmentyPlanu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSegmentyPlanu }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getSegmentyPlanu")
    public JAXBElement<GetSegmentyPlanu> createGetSegmentyPlanu(GetSegmentyPlanu value) {
        return new JAXBElement<>(_GetSegmentyPlanu_QNAME, GetSegmentyPlanu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegmentyPlanuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSegmentyPlanuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getSegmentyPlanuResponse")
    public JAXBElement<GetSegmentyPlanuResponse> createGetSegmentyPlanuResponse(GetSegmentyPlanuResponse value) {
        return new JAXBElement<>(_GetSegmentyPlanuResponse_QNAME, GetSegmentyPlanuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudijniProgramInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudijniProgramInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getStudijniProgramInfo")
    public JAXBElement<GetStudijniProgramInfo> createGetStudijniProgramInfo(GetStudijniProgramInfo value) {
        return new JAXBElement<>(_GetStudijniProgramInfo_QNAME, GetStudijniProgramInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudijniProgramInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudijniProgramInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getStudijniProgramInfoResponse")
    public JAXBElement<GetStudijniProgramInfoResponse> createGetStudijniProgramInfoResponse(GetStudijniProgramInfoResponse value) {
        return new JAXBElement<>(_GetStudijniProgramInfoResponse_QNAME, GetStudijniProgramInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudijniProgramy }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudijniProgramy }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getStudijniProgramy")
    public JAXBElement<GetStudijniProgramy> createGetStudijniProgramy(GetStudijniProgramy value) {
        return new JAXBElement<>(_GetStudijniProgramy_QNAME, GetStudijniProgramy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudijniProgramyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudijniProgramyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "getStudijniProgramyResponse")
    public JAXBElement<GetStudijniProgramyResponse> createGetStudijniProgramyResponse(GetStudijniProgramyResponse value) {
        return new JAXBElement<>(_GetStudijniProgramyResponse_QNAME, GetStudijniProgramyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OborInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OborInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "oborInfo")
    public JAXBElement<OborInfoType> createOborInfo(OborInfoType value) {
        return new JAXBElement<>(_OborInfo_QNAME, OborInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OborInfoListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OborInfoListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "oborInfoList")
    public JAXBElement<OborInfoListType> createOborInfoList(OborInfoListType value) {
        return new JAXBElement<>(_OborInfoList_QNAME, OborInfoListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OborQRAMInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OborQRAMInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "oborQRAMInfo")
    public JAXBElement<OborQRAMInfoType> createOborQRAMInfo(OborQRAMInfoType value) {
        return new JAXBElement<>(_OborQRAMInfo_QNAME, OborQRAMInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OborQRAMInfoListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OborQRAMInfoListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "oborQRAMInfoList")
    public JAXBElement<OborQRAMInfoListType> createOborQRAMInfoList(OborQRAMInfoListType value) {
        return new JAXBElement<>(_OborQRAMInfoList_QNAME, OborQRAMInfoListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlanInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "planInfo")
    public JAXBElement<PlanInfoType> createPlanInfo(PlanInfoType value) {
        return new JAXBElement<>(_PlanInfo_QNAME, PlanInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanInfoListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlanInfoListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "planInfoList")
    public JAXBElement<PlanInfoListType> createPlanInfoList(PlanInfoListType value) {
        return new JAXBElement<>(_PlanInfoList_QNAME, PlanInfoListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProgramInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "programInfo")
    public JAXBElement<ProgramInfoType> createProgramInfo(ProgramInfoType value) {
        return new JAXBElement<>(_ProgramInfo_QNAME, ProgramInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInfoListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProgramInfoListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "programInfoList")
    public JAXBElement<ProgramInfoListType> createProgramInfoList(ProgramInfoListType value) {
        return new JAXBElement<>(_ProgramInfoList_QNAME, ProgramInfoListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramOblVzdelType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProgramOblVzdelType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "programOblVzdel")
    public JAXBElement<ProgramOblVzdelType> createProgramOblVzdel(ProgramOblVzdelType value) {
        return new JAXBElement<>(_ProgramOblVzdel_QNAME, ProgramOblVzdelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramOblVzdelListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProgramOblVzdelListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "programOblVzdelList")
    public JAXBElement<ProgramOblVzdelListType> createProgramOblVzdelList(ProgramOblVzdelListType value) {
        return new JAXBElement<>(_ProgramOblVzdelList_QNAME, ProgramOblVzdelListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SegmentInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "segmentInfo")
    public JAXBElement<SegmentInfoType> createSegmentInfo(SegmentInfoType value) {
        return new JAXBElement<>(_SegmentInfo_QNAME, SegmentInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentInfoListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SegmentInfoListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stag-ws.zcu.cz/", name = "segmentInfoList")
    public JAXBElement<SegmentInfoListType> createSegmentInfoList(SegmentInfoListType value) {
        return new JAXBElement<>(_SegmentInfoList_QNAME, SegmentInfoListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fakulta", scope = GetStudijniProgramy.class)
    public JAXBElement<String> createGetStudijniProgramyFakulta(String value) {
        return new JAXBElement<>(_GetStudijniProgramyFakulta_QNAME, String.class, GetStudijniProgramy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rok", scope = GetStudijniProgramy.class)
    public JAXBElement<String> createGetStudijniProgramyRok(String value) {
        return new JAXBElement<>(_GetStudijniProgramyRok_QNAME, String.class, GetStudijniProgramy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "kod", scope = GetStudijniProgramy.class)
    public JAXBElement<String> createGetStudijniProgramyKod(String value) {
        return new JAXBElement<>(_GetStudijniProgramyKod_QNAME, String.class, GetStudijniProgramy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "forma", scope = GetStudijniProgramy.class)
    public JAXBElement<String> createGetStudijniProgramyForma(String value) {
        return new JAXBElement<>(_GetStudijniProgramyForma_QNAME, String.class, GetStudijniProgramy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "typ", scope = GetStudijniProgramy.class)
    public JAXBElement<String> createGetStudijniProgramyTyp(String value) {
        return new JAXBElement<>(_GetStudijniProgramyTyp_QNAME, String.class, GetStudijniProgramy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "jazyk", scope = GetStudijniProgramy.class)
    public JAXBElement<String> createGetStudijniProgramyJazyk(String value) {
        return new JAXBElement<>(_GetStudijniProgramyJazyk_QNAME, String.class, GetStudijniProgramy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "profil", scope = GetStudijniProgramy.class)
    public JAXBElement<String> createGetStudijniProgramyProfil(String value) {
        return new JAXBElement<>(_GetStudijniProgramyProfil_QNAME, String.class, GetStudijniProgramy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "pouzePlatne", scope = GetStudijniProgramy.class)
    public JAXBElement<Boolean> createGetStudijniProgramyPouzePlatne(Boolean value) {
        return new JAXBElement<>(_GetStudijniProgramyPouzePlatne_QNAME, Boolean.class, GetStudijniProgramy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetStudijniProgramy.class)
    public JAXBElement<String> createGetStudijniProgramyLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetStudijniProgramy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetStudijniProgramInfo.class)
    public JAXBElement<String> createGetStudijniProgramInfoLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetStudijniProgramInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetSegmentyPlanu.class)
    public JAXBElement<String> createGetSegmentyPlanuLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetSegmentyPlanu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetSegmentInfo.class)
    public JAXBElement<String> createGetSegmentInfoLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetSegmentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rok", scope = GetPlanyStudenta.class)
    public JAXBElement<String> createGetPlanyStudentaRok(String value) {
        return new JAXBElement<>(_GetStudijniProgramyRok_QNAME, String.class, GetPlanyStudenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetPlanyStudenta.class)
    public JAXBElement<String> createGetPlanyStudentaLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetPlanyStudenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rok", scope = GetPlanyOboru.class)
    public JAXBElement<String> createGetPlanyOboruRok(String value) {
        return new JAXBElement<>(_GetStudijniProgramyRok_QNAME, String.class, GetPlanyOboru.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetPlanyOboru.class)
    public JAXBElement<String> createGetPlanyOboruLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetPlanyOboru.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetPlanInfo.class)
    public JAXBElement<String> createGetPlanInfoLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetPlanInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rok", scope = GetOboryStudijnihoProgramu.class)
    public JAXBElement<String> createGetOboryStudijnihoProgramuRok(String value) {
        return new JAXBElement<>(_GetStudijniProgramyRok_QNAME, String.class, GetOboryStudijnihoProgramu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetOboryStudijnihoProgramu.class)
    public JAXBElement<String> createGetOboryStudijnihoProgramuLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetOboryStudijnihoProgramu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "oborIdno", scope = GetOboryQRAMInfo.class)
    public JAXBElement<Long> createGetOboryQRAMInfoOborIdno(Long value) {
        return new JAXBElement<>(_GetOboryQRAMInfoOborIdno_QNAME, Long.class, GetOboryQRAMInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fakulta", scope = GetOboryQRAMInfo.class)
    public JAXBElement<String> createGetOboryQRAMInfoFakulta(String value) {
        return new JAXBElement<>(_GetStudijniProgramyFakulta_QNAME, String.class, GetOboryQRAMInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rok", scope = GetOboryQRAMInfo.class)
    public JAXBElement<String> createGetOboryQRAMInfoRok(String value) {
        return new JAXBElement<>(_GetStudijniProgramyRok_QNAME, String.class, GetOboryQRAMInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "forma", scope = GetOboryQRAMInfo.class)
    public JAXBElement<String> createGetOboryQRAMInfoForma(String value) {
        return new JAXBElement<>(_GetStudijniProgramyForma_QNAME, String.class, GetOboryQRAMInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "typ", scope = GetOboryQRAMInfo.class)
    public JAXBElement<String> createGetOboryQRAMInfoTyp(String value) {
        return new JAXBElement<>(_GetStudijniProgramyTyp_QNAME, String.class, GetOboryQRAMInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "jazyk", scope = GetOboryQRAMInfo.class)
    public JAXBElement<String> createGetOboryQRAMInfoJazyk(String value) {
        return new JAXBElement<>(_GetStudijniProgramyJazyk_QNAME, String.class, GetOboryQRAMInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "pouzePlatne", scope = GetOboryQRAMInfo.class)
    public JAXBElement<Boolean> createGetOboryQRAMInfoPouzePlatne(Boolean value) {
        return new JAXBElement<>(_GetStudijniProgramyPouzePlatne_QNAME, Boolean.class, GetOboryQRAMInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetOborInfo.class)
    public JAXBElement<String> createGetOborInfoLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetOborInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetOblastiVzdelavaniProgramu.class)
    public JAXBElement<String> createGetOblastiVzdelavaniProgramuLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetOblastiVzdelavaniProgramu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetBlokySegmentu.class)
    public JAXBElement<String> createGetBlokySegmentuLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetBlokySegmentu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetBlokyPlanu.class)
    public JAXBElement<String> createGetBlokyPlanuLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetBlokyPlanu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lang", scope = GetBlokInfo.class)
    public JAXBElement<String> createGetBlokInfoLang(String value) {
        return new JAXBElement<>(_GetStudijniProgramyLang_QNAME, String.class, GetBlokInfo.class, value);
    }

}
