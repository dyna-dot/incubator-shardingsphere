/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.parse.rule.jaxb.loader;

import org.apache.shardingsphere.spi.DatabaseTypes;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public final class RuleDefinitionFileConstantTest {
    
    @Test
    public void assertGetGeneralExtractorRuleDefinitionFile() {
        assertThat(RuleDefinitionFileConstant.getExtractorRuleDefinitionFile(), is("META-INF/parsing-rule-definition/extractor-rule-definition.xml"));
    }
    
    @Test
    public void assertGetExtractorRuleDefinitionFile() {
        assertThat(RuleDefinitionFileConstant.getExtractorRuleDefinitionFile("sharding", DatabaseTypes.getDatabaseType("MySQL")),
                is("META-INF/parsing-rule-definition/sharding/mysql/extractor-rule-definition.xml"));
    }
    
    @Test
    public void assertGetGeneralFillerRuleDefinitionFile() {
        assertThat(RuleDefinitionFileConstant.getFillerRuleDefinitionFile(), is("META-INF/parsing-rule-definition/filler-rule-definition.xml"));
    }
    
    @Test
    public void assertGetFeatureGeneralFillerRuleDefinitionFile() {
        assertThat(RuleDefinitionFileConstant.getFillerRuleDefinitionFile("sharding"), is("META-INF/parsing-rule-definition/sharding/filler-rule-definition.xml"));
    }
    
    @Test
    public void assertGetFillerRuleDefinitionFile() {
        assertThat(RuleDefinitionFileConstant.getFillerRuleDefinitionFile("sharding", DatabaseTypes.getDatabaseType("MySQL")), 
                is("META-INF/parsing-rule-definition/sharding/mysql/filler-rule-definition.xml"));
    }
    
    @Test
    public void assertGetSQLStatementRuleDefinitionFile() {
        assertThat(RuleDefinitionFileConstant.getSQLStatementRuleDefinitionFile("sharding", DatabaseTypes.getDatabaseType("MySQL")), 
                is("META-INF/parsing-rule-definition/sharding/mysql/sql-statement-rule-definition.xml"));
    }
}
