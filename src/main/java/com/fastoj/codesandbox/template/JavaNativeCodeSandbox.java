package com.fastoj.codesandbox.template;

import com.fastoj.codesandbox.model.ExecuteCodeRequest;
import com.fastoj.codesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;

/**
 * 原生Java代码沙箱 - 实现模板方法
 *
 * @author Shier 2023/9/4 17:18
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {


    /**
     * 执行程序
     * @param executeCodeRequest
     * @return
     */
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) throws FileNotFoundException {
        return super.executeCode(executeCodeRequest);
    }
}
