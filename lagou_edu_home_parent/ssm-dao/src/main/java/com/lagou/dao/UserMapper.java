package com.lagou.dao;

import com.lagou.domain.*;

import java.util.List;

public interface UserMapper {

    /**
     * 用户分页&多条件查询
     */
     public List<User> findAllUserByPage(UserVo userVo);

    /**
     * 修改用户状态
     */
    public void updateUserStatus(User user);

    /**
     * 用户登陆（根据用户名查询具体的用户信息）
     */
    public User login(User user);

    /**
     * 根据用户ID清空中间表
     */
    public void deleteUserContextRole(Integer userId);

    /**
     * 分配角色
     */
    public void userContextRole(User_Role_relation user_role_relation);




    /**
     * 1.根据用户ID查询关联的角色信息
     */
    public List<Role> findUserRelationRoleById(Integer userId);

    /**
     * 2.根据角色ID，查询角色所拥有的顶级菜单（-1）
     */
    public List<Menu> findParentMenuByRoleId(List<Integer> ids);

    /**
     * 3.根据父菜单，查询子菜单信息
     */
    public List<Menu> findSubMenuByPid(Integer pid);
    /**
     * 4.获取用户拥有的资源权限信息
     */
    public List<Resource> findResourceByRoleId(List<Integer> ids);
   
    public List<Resource> findResourceByRoleId2(List<Integer> ids);
    
    public void mytest1();
    public void mytest2();
    public void mytest3();
    public void mytest4();
    public void mytest5();
    public void mytest6();
    public void mytest7();
    public void mytest8();
    public void mytest9();
    public void mytest10();
    public void mytest11();


}
