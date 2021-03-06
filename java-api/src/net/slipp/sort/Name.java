package net.slipp.sort;

public class Name implements SortComparable<Name> {
	private String name;

	public Name(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean compareTo(Name target) {
		return this.name.charAt(0) < target.name.charAt(0);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
