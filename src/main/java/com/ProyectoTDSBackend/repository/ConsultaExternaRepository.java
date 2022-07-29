package com.ProyectoTDSBackend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ProyectoTDSBackend.dto.ConstExternaListDTO;
import com.ProyectoTDSBackend.dto.ConsultaExternaByIdDTO;
import com.ProyectoTDSBackend.models.ConsultaExterna;

public interface ConsultaExternaRepository extends JpaRepository<ConsultaExterna, Long> {

    // Obtener el máximo de historia clinica
    @Query(value = "SELECT MAX(historia_clinica)"
            + " FROM consulta_externa"
            + " WHERE estado = 'a'; ", nativeQuery = true)
    public int getMaxHistoriaClinica();

    // comprobar si existe un registro con el mismo número de historia clinica
    @Query(value = "SELECT historia_clinica FROM COMPARARNOIGUALES(?1) as(historia_clinica BIGINT);", nativeQuery = true)
    public int comprobarHistoriaClinica(int historiaClinica);

    // Seleccionar registros de consulta externa
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    public List<ConstExternaListDTO> getConsultaExterna();

    // Seleccionar registros de consulta externa por id
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    public ConsultaExternaByIdDTO getConsultaExternaById(int idConExt);

     // generar pdf de consulta externa
     @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
     @Query(nativeQuery = true)
     public List<ConsultaExternaByIdDTO> generarPdfConsultaExterna(@Param("idConExt") Long idConExt);

    // UPDATE ESTADO DE CONSULTA EXTERNA
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    @Query(value = "UPDATE consulta_externa ce"
    +" SET estado = 'i'"
    +" FROM usuario us" 
    +" WHERE us.id = ce.id_usuario "
    +" AND ce.id_consexterna = :idConExt", nativeQuery = true)
    public void updateEstadoConsultaExterna(int idConExt);

    // actualizar registro de consulta externa
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    @Query(value = "UPDATE consulta_externa ce"
    + " SET enfermedad_actual = :enfActual, "
    + " establecimiento = :establecimiento,"
    + " fecha = :fecha,"
    + " motivo_consulta = :motConsulta,"
    + " duracion_consulta = :durConsulta, "
    + " nombres_profesional = :nombreProfesional"
    + " FROM usuario us "
    + " WHERE us.id = ce.id_usuario and ce.id_consexterna = :idConExt", nativeQuery = true)
    public void updateConsultaExterna(String enfActual, String establecimiento, Date fecha, String motConsulta, String durConsulta, String nombreProfesional, int idConExt);

    // Actualizar antecedentes personales
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    @Query(value = "UPDATE antec_personales ap"
    +" SET clinicos = :clinicos,"
    +" quirurgicos = :quirurgicos"
    +" FROM consulta_externa ce"
    +" WHERE ce.id_consexterna = ap.id_consexterna"
    +" and ce.id_consexterna = :idConExt", nativeQuery = true)
    public void updateAntecPersonales(String clinicos, String quirurgicos, int idConExt);

    // Actualizar antecedentes familiares
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    @Query(value = "UPDATE antec_familiares af"
    +" SET cancer = :cancer,"
    +" cardiopatia = :cardiopatia,"
    +" diabetes = :diabetes,"
    +" enf_cardiovasculares = :enfCardio,"
    +" enf_infecciosas = :enfInfec,"
    +" enf_mentales = :enfMental,"
    +" familiares = :familiares,"
    +" hipertension = :hipertension, "
    +" malformaciones = :malformaciones," 
    +" otros = :otros," 
    +" tuberculosis = :tuberculosis"
    +" FROM consulta_externa ce"
    +" WHERE ce.id_consexterna = af.id_consexterna "
    +" and ce.id_consexterna = :idConExt", nativeQuery = true)
    public void updateAntecFamiliares(boolean cancer, boolean cardiopatia, boolean diabetes, boolean enfCardio, boolean enfInfec, boolean enfMental, String familiares, boolean hipertension, boolean malformaciones, boolean otros, boolean tuberculosis, int idConExt);

    // Actualizar revision de organos del sistema
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    @Query(value = "UPDATE rev_organo_sistem ro"
    +" SET cardiovascular = :cardiovascular,"
    +" descripcion = :descripcion," 
    +" digestivo = :digestivo, "
    +" endocrino = :endocrino," 
    +" genital = :genital," 
    +" hemolenfatico = :hemolenfatico," 
    +" musculo_esqueletico = :musEsq," 
    +" nervioso = :nervioso," 
    +" organo_sentido = :orgSen," 
    +" respiratorio = :respiratorio," 
    +" urinario = :urinario" 
    +" FROM consulta_externa ce" 
    +" WHERE ce.id_consexterna = ro.id_consexterna"
    +" and ce.id_consexterna = :idConExt", nativeQuery = true)
    public void updateRevOrganosSistema(String cardiovascular, String descripcion, String digestivo, String endocrino, String genital, String hemolenfatico, String musEsq, String nervioso, String orgSen, String respiratorio, String urinario, int idConExt);

    // Actualizar signos vitales
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    @Query(value = "UPDATE sigvit_antropometria sa"
    +" SET fecha_medicion = :fechaMed,"
    +" frec_respiratoria = :freResp," 
    +" peso = :peso,"
    +" presion_arterial = :preArt,"
    +" pulso = :pulso," 
    +" talla = :talla," 
    +" temperatura = :temp"
    +" FROM consulta_externa ce" 
    +" WHERE ce.id_consexterna = sa.id_consexterna"
    +" and ce.id_consexterna = :idConExt", nativeQuery = true)
    public void updateSigVitAntropometria(Date fechaMed, int freResp, double peso, String preArt, int pulso, double talla, double temp, int idConExt);

    // update Examen fisico regional 
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    @Query(value = "UPDATE exam_fisico_regional ef"
    +" SET abdomen = :abdomen," 
    +" cabeza = :cabeza,"
    +" cuello = :cuello,"
    +" extremidades = :extremidades," 
    +" observaciones = :observaciones," 
    +" pelvis = :pelvis,"
    +" torax = :torax"
    +" FROM consulta_externa ce" 
    +" WHERE ce.id_consexterna = ef.id_consexterna"
    +" and ce.id_consexterna = :idConExt",nativeQuery = true)
    public void updateExamFisicoRegional(String abdomen, String cabeza, String cuello, String extremidades, String observaciones, String pelvis, String torax, int idConExt);

    // update diagnostico
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    @Query(value = "UPDATE diagnosticos d"
    +" SET cie = :cie,"
    +" descripcion_diagnostico = :desDiag," 
    +" descripcion_pre_def = :desPreDef,"
    +" descripcion_pre_def_cie = :desPreDefCie,"
    +" descripcion_pre_def_pre_def = :desPreDefPreDef," 
    +" pre_def = :preDef"
    +" FROM consulta_externa ce"
    +" WHERE ce.id_consexterna = d.id_consexterna"
    +" and ce.id_consexterna = :idConExt", nativeQuery = true)
    public void updateDiagnostico(String cie, String desDiag, String desPreDef, String desPreDefCie, String desPreDefPreDef, String preDef, int idConExt);

    // update plan tratamiento
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    @Query(value = "UPDATE plan_tratamiento pt"
    +" SET c = :c,"
    +" i = :i," 
    +" l = :l,"
    +" m = :m,"
    +" o = :o," 
    +" r = :r," 
    +" t = :t"
    +" FROM consulta_externa ce" 
    +" WHERE ce.id_consexterna = pt.id_consexterna"
    +" and ce.id_consexterna = :idConExt", nativeQuery = true)
    public void updatePlanTratamiento(String c, String i, String l, String m, String o, String r, String t, int idConExt);
}
