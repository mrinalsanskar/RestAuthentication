package com.cg.fms.authenticate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/*An entity is a lightweight persistence domain object & represents a table in a relational database.
 *Each entity instance corresponds to a row in that table. The persistent state of an entity is represented through either persistent fields or persistent properties. 
 *These fields or properties use object/relational mapping annotations to map the entities and entity relationships to the relational data in the underlying data store.
 * 
 * 
 * author sanskar.
 */

@Entity
@Table(name="User_credentials")
public class UserEntity {
	
    @Id
    @Column(name="userId")
    @NotBlank
	@Size(min=4, max = 20)
    private Long userId;
    
    @NotBlank
	@Size(min=4, max = 20)
    @Column(name="userName")
    private String username;
    
    @NotBlank
	@Size(min=8, max = 50)
    @Column(name="full_name")
    private String fullName;
    
    @NotBlank
	@Size(min=8, max = 120)
    @Column(name="password")
    private String password;

    @Column(name="gender")
    private String gender;
    
    @NotBlank
    @Column(name="role")
    private String role;

   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}

