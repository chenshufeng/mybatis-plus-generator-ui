import com.github.davidfantasy.mybatisplus.generatorui.GeneratorConfig;
import com.github.davidfantasy.mybatisplus.generatorui.MybatisPlusToolsApplication;
import com.github.davidfantasy.mybatisplus.generatorui.mbp.NameConverter;

public class HuomaiApplication {


    public static void main(String[] args) {
        GeneratorConfig config = GeneratorConfig.builder().jdbcUrl("jdbc:mysql://47.100.203.50:3306/huomai-dev")
                .userName("root")
                .password("huomai2021xsw2")
                .port(8068)
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .basePackage("com.huomai.h")
                .nameConverter(new NameConverter() {

                })
                .build();
        MybatisPlusToolsApplication.run(config);
    }


}
