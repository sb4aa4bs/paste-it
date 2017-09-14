package my.abs2.propro.example.demo.contoller;

import my.abs2.propro.example.demo.model.PostIt;
import my.abs2.propro.example.demo.utils.PasteitUtils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasteitContoller {

	@RequestMapping("/")
	public List<PostIt> getPostedPosts() {
		List<PostIt> postList = new ArrayList<PostIt>();
		PasteitUtils utils = PasteitUtils.getInstance();
		PasteitUtils.PasteitCommonUtils pasteitCommonUtils = utils.new PasteitCommonUtils();
		postList = pasteitCommonUtils.getPostsFromDB();
		return postList;
	}

}
