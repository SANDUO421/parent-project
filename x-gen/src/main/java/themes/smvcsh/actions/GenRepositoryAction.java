// Decompiled by DJ v3.9.9.91 Copyright 2005 Atanas Neshkov  Date: 2014-1-28 15:51:01
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!

// Source File Name:   GenRepositoryAction.java

package themes.smvcsh.actions;

import cn.javass.xgen.genconf.vo.ModuleConfModel;
import cn.javass.xgen.geninvocation.BaseGenAction;
import cn.javass.xgen.geninvocation.decorator.GenComponent;

public class GenRepositoryAction extends BaseGenAction
{

    public GenRepositoryAction()
    {
    }

    public Object initObject()
    {
        return "";
    }

    public Object execute(ModuleConfModel moduleConf, Object obj)
    {
        return obj;
    }

    public Object executeDecorators(ModuleConfModel moduleConf, Object obj, GenComponent gc)
    {
        return gc.operation(moduleConf, "GenRepository", obj);
    }

    public GenComponent beforeAction(ModuleConfModel moduleConf)
    {
        return super.defaultBeforeAction(moduleConf);
    }
}