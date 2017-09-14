package my.abs2.propro.example.demo.utils;

import java.util.ArrayList;
import java.util.List;

import my.abs2.propro.example.demo.model.PostIt;

public class PasteitUtils {

	private static PasteitUtils utils;

	private PasteitUtils() {

	}

	class PastitDBUtils {

	}

	class PasteitCollectionUtils {

	}

	class PasteitLogUtils {

	}

	class PasteitExceptionHandler {

	}

	public class PasteitCommonUtils {
		public List<PostIt> getPostsFromDB() {
			List<PostIt> postList = new ArrayList<PostIt>();
			PostIt post = new PostIt("DuckDuckGo", Long.toString(System.currentTimeMillis()), "DuckDuckGo");
			postList.add(post);
			System.out.println("Post List :::: " +postList.toString());
			return postList;
		}
	}

	public synchronized static PasteitUtils getInstance() {
		if (utils == null) {
			utils = new PasteitUtils();
			System.out.println("PasteitUtils Class Object created...!!!");
		} else {
			System.out.println("PasteitUtils Class Object not Created just returned existing one...!!!");
		}
		return utils;
	}

}
