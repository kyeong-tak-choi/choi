package domain;

public class boardDao {
	 private int idx;
	    private String title;
	    private String contents;
	    private String image;
	    public boardDao() {
	    // TODO Auto-generated constructor stub
	    }
	    public int getIdx() {
	        return idx;
	    }
	    public void setIdx(int idx) {
	        this.idx = idx;
	    }
	    public String getTitle() {
	        return title;
	    }
	    public void setTitle(String title) {
	        this.title = title;
	    }
	    public String getContents() {
	        return contents;
	    }
	    public void setContents(String contents) {
	        this.contents = contents;
	    }
	    public String getImage() {
	        return image;
	    }
	    public void setImage(String image) {
	        this.image = image;
	    }
	    public boardDao(int idx, String title, String contents, String image) {
	        super();
	        this.idx = idx;
	        this.title = title;
	        this.contents = contents;
	        this.image = image;
	    }
}
