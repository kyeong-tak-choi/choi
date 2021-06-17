package service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.boardDao;
import mapper.BoardMapper;

@Service
public class BoardService {
    @Autowired private BoardMapper m;
	
    public List<boardDao> getBoard(){
        return m.getBoard();
    }
}