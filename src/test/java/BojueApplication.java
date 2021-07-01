import com.github.davidfantasy.mybatisplus.generatorui.GeneratorConfig;
import com.github.davidfantasy.mybatisplus.generatorui.MybatisPlusToolsApplication;
import com.github.davidfantasy.mybatisplus.generatorui.mbp.NameConverter;

public class BojueApplication {


    public static void main(String[] args) {
        GeneratorConfig config = GeneratorConfig.builder().jdbcUrl("jdbc:mysql://116.63.114.104:3306/bj-dev")
                .userName("root")
                .password("bojue2021xsw2")
                .port(8069)
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .basePackage("com.bojue")
                .nameConverter(new NameConverter() {

                })
                .build();
        MybatisPlusToolsApplication.run(config);
    }


}
