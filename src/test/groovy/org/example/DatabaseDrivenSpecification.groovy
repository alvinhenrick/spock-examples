package org.example

import groovy.sql.Sql
import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by ahenrick on 6/11/14.
 */
class DatabaseDrivenSpecification extends Specification {

    @Shared sql = Sql.newInstance("jdbc:h2:mem:", "org.h2.Driver")

    // insert data (usually the database would already contain the data)
    def setupSpec() {
        sql.execute("create table maxdata (id int primary key, a int, b int, c int)")
        sql.execute("insert into maxdata values (1, 3, 7, 7), (2, 5, 4, 5), (3, 9, 9, 9)")
    }

    def "maximum of #a and #b is #c"() {
        expect:
        Math.max(a, b) == c

        where:
        [a, b, c] << sql.rows("select a, b, c from maxdata")
    }
}

