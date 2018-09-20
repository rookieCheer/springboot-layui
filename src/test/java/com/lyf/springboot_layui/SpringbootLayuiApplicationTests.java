package com.lyf.springboot_layui;

import com.lyf.springboot_layui.entiry.SysShiroPermission;
import com.lyf.springboot_layui.service.ISysShiroPermissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootLayuiApplicationTests {

	@Autowired
	ISysShiroPermissionService sysShiroPermissionServiceImpl;

	@Test
	public void contextLoads() {
		List<SysShiroPermission> sysShiroPermissions = sysShiroPermissionServiceImpl.selectList(null);
		sysShiroPermissions.forEach(x->{
			System.out.println(x.toString());
		});
	}

}
