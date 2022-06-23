package Streams;

public class News {
int newsid;
String postbyuser;
String commentbyuser;
String comment;
public News(int newsid, String postbyuser, String commentbyuser, String comment) {
	super();
	this.newsid = newsid;
	this.postbyuser = postbyuser;
	this.commentbyuser = commentbyuser;
	this.comment = comment;
}
@Override
public String toString() {
	return "News [newsid=" + newsid + ", postbyuser=" + postbyuser + ", commentbyuser=" + commentbyuser + ", comment="
			+ comment + "]";
}

}
