package train.minisystem.entity;

import javax.persistence.*;

/**
 * Created by oleg on 29.09.15.
 */
@Entity
@Table(name = "user", schema = "", catalog = "helperk_db")
public class UserEntity {
	private int id;
	private int type;
	private String name;
	private String surname;
	private String email;

	@Id
	@Column(name = "id", nullable = false, insertable = true, updatable = true)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "type", nullable = false, insertable = true, updatable = true)
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Basic
	@Column(name = "name", nullable = false, insertable = true, updatable = true, length = 45)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "surname", nullable = false, insertable = true, updatable = true, length = 45)
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Basic
	@Column(name = "email", nullable = false, insertable = true, updatable = true, length = 45)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		UserEntity that = (UserEntity) o;

		if (id != that.id) return false;
		if (type != that.type) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
		if (email != null ? !email.equals(that.email) : that.email != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + type;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (surname != null ? surname.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		return result;
	}
}
