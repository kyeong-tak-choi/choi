package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.boardDao;
import service.BoardService;

@Controller
public class mainController {
	
    @Autowired
    private BoardService s;
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String root() {
        return "index";
    }
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String index() {
        return "index";
    }
    @RequestMapping(value="/board", method=RequestMethod.GET)
    public String board() {
        return "board";
    }
	
    @RequestMapping(value="/boardList", method=RequestMethod.GET)
    
    public List<boardDao> boardList(){
        return s.getBoard();
    }
		
		
	
}
