package com.example;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Personnel {
    private int idPersonal;
    private int idOrganization;
    private int idProfession;
    private String jobStatus;
    private Integer idEmployee;
    private Date dateFrom;
    private Date dateTo;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_personal", nullable = false)
    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    @Basic
    @Column(name = "id_organization", nullable = false)
    public int getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(int idOrganization) {
        this.idOrganization = idOrganization;
    }

    @Basic
    @Column(name = "id_profession", nullable = false)
    public int getIdProfession() {
        return idProfession;
    }

    public void setIdProfession(int idProfession) {
        this.idProfession = idProfession;
    }

    @Basic
    @Column(name = "job_status", nullable = false, length = 1)
    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    @Basic
    @Column(name = "id_employee", nullable = true)
    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Basic
    @Column(name = "date_from", nullable = true)
    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    @Basic
    @Column(name = "date_to", nullable = true)
    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personnel personnel = (Personnel) o;
        return idPersonal == personnel.idPersonal && idOrganization == personnel.idOrganization && idProfession == personnel.idProfession && Objects.equals(jobStatus, personnel.jobStatus) && Objects.equals(idEmployee, personnel.idEmployee) && Objects.equals(dateFrom, personnel.dateFrom) && Objects.equals(dateTo, personnel.dateTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersonal, idOrganization, idProfession, jobStatus, idEmployee, dateFrom, dateTo);
    }
}
