/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nashtech.ass.phuochg.coffeeshop.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Phước Hà
 */
@Entity
@Table(name = "information")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Information implements Serializable {

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_info")
    private Long idInfo;
    @Size(min = 1, max = 256)
    @Column(name = "address")
    private String address;
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Size(min = 1, max = 10)
    @Column(name = "phone_number")
    private String phoneNumber;
    @JoinColumn(name = "id_account", referencedColumnName = "id_account")
    @ManyToOne
    private Account account;

    
}
