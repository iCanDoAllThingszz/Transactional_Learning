package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Dept;
import generator.service.DeptService;
import generator.mapper.DeptMapper;
import org.springframework.stereotype.Service;

/**
* @author zhaoyu
* @description 针对表【dept】的数据库操作Service实现
* @createDate 2024-11-14 11:33:41
*/
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept>
    implements DeptService{

}




