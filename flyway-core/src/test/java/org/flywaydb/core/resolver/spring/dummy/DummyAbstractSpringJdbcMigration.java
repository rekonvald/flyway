/**
 * Copyright 2010-2014 Axel Fontaine and the many contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core.resolver.spring.dummy;

import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Test for abstract class support.
 */
public abstract class DummyAbstractSpringJdbcMigration implements SpringJdbcMigration {
    public final void migrate(JdbcTemplate jdbcTemplate) throws Exception {
        doMigrate(jdbcTemplate);
    }

    public abstract void doMigrate(JdbcTemplate jdbcTemplate) throws Exception;
}
