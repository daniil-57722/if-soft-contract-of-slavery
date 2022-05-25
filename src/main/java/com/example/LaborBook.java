package com.example;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "labor_book", schema = "practice", catalog = "")
public class LaborBook {
    private int idLb;
    private int idEmployee;
    private Integer idOrganization;
    private Integer idProfession;
    private String notEduOrganization;
    private String notEduProfession;
    private String workMark;
    private Date dateFrom;
    private Date dateTo;
    private Long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_lb", nullable = false)
    public int getIdLb() {
        return idLb;
    }

    public void setIdLb(int idLb) {
        this.idLb = idLb;
    }

    @Basic
    @Column(name = "id_employee", nullable = false)
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Basic
    @Column(name = "id_organization", nullable = true)
    public Integer getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(Integer idOrganization) {
        this.idOrganization = idOrganization;
    }

    @Basic
    @Column(name = "id_profession", nullable = true)
    public Integer getIdProfession() {
        return idProfession;
    }

    public void setIdProfession(Integer idProfession) {
        this.idProfession = idProfession;
    }

    @Basic
    @Column(name = "not_edu_organization", nullable = true, length = 128)
    public String getNotEduOrganization() {
        return notEduOrganization;
    }

    public void setNotEduOrganization(String notEduOrganization) {
        this.notEduOrganization = notEduOrganization;
    }

    @Basic
    @Column(name = "not_edu_profession", nullable = true, length = 128)
    public String getNotEduProfession() {
        return notEduProfession;
    }

    public void setNotEduProfession(String notEduProfession) {
        this.notEduProfession = notEduProfession;
    }

    @Basic
    @Column(name = "work_mark", nullable = true, length = 256)
    public String getWorkMark() {
        return workMark;
    }

    public void setWorkMark(String workMark) {
        this.workMark = workMark;
    }

    @Basic
    @Column(name = "date_from", nullable = false)
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
        LaborBook laborBook = (LaborBook) o;
        return idLb == laborBook.idLb && idEmployee == laborBook.idEmployee && Objects.equals(idOrganization, laborBook.idOrganization) && Objects.equals(idProfession, laborBook.idProfession) && Objects.equals(notEduOrganization, laborBook.notEduOrganization) && Objects.equals(notEduProfession, laborBook.notEduProfession) && Objects.equals(workMark, laborBook.workMark) && Objects.equals(dateFrom, laborBook.dateFrom) && Objects.equals(dateTo, laborBook.dateTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLb, idEmployee, idOrganization, idProfession, notEduOrganization, notEduProfession, workMark, dateFrom, dateTo);
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
