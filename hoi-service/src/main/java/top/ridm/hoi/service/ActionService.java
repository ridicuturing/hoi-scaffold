package top.ridm.hoi.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.ridm.hoi.repository.domain.Action;
import top.ridm.hoi.repository.mapper.ActionRepository;

@Service
public class ActionService {

    @Resource
    ActionRepository actionRepository;

    public Action createAction() {
        Action action = new Action();
        action.setMessageSn("messagesn");
        action.setChatSn("setChatSn");
        action.setActionContent("setActionContent");
        action.setResult("setResult");
        action.setState(1L);
        return actionRepository.save(action);
    }
}
