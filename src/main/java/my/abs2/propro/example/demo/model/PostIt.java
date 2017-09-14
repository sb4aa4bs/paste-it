package my.abs2.propro.example.demo.model;

public class PostIt {
	String postIt;
	String Timestamp;
	String Tags;
	
	

	public PostIt(String postIt, String timestamp, String tags) {
		super();
		this.postIt = postIt;
		Timestamp = timestamp;
		Tags = tags;
	}

	public String getPostIt() {
		return postIt;
	}

	public void setPostIt(String postIt) {
		this.postIt = postIt;
	}

	public String getTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(String timestamp) {
		Timestamp = timestamp;
	}

	public String getTags() {
		return Tags;
	}

	public void setTags(String tags) {
		Tags = tags;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Tags == null) ? 0 : Tags.hashCode());
		result = prime * result + ((Timestamp == null) ? 0 : Timestamp.hashCode());
		result = prime * result + ((postIt == null) ? 0 : postIt.hashCode());
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
		PostIt other = (PostIt) obj;
		if (Tags == null) {
			if (other.Tags != null)
				return false;
		} else if (!Tags.equals(other.Tags))
			return false;
		if (Timestamp == null) {
			if (other.Timestamp != null)
				return false;
		} else if (!Timestamp.equals(other.Timestamp))
			return false;
		if (postIt == null) {
			if (other.postIt != null)
				return false;
		} else if (!postIt.equals(other.postIt))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PostIt [postIt=").append(postIt).append(", Timestamp=").append(Timestamp).append(", Tags=")
				.append(Tags).append("]");
		return builder.toString();
	}

}
