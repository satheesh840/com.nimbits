/*
 * Copyright 2016 Benjamin Sautner
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.nimbits.server.orm;

import com.nimbits.client.model.category.Category;
import com.nimbits.client.model.entity.Entity;

import javax.jdo.annotations.Cacheable;
import javax.jdo.annotations.PersistenceCapable;

@Cacheable
@PersistenceCapable
public class CategoryEntity extends EntityStore implements Category {

    private static final long serialVersionUID = -4488132572071199717L;

    @SuppressWarnings("unused")
    protected CategoryEntity() {
    }


    public CategoryEntity(final Entity entity) {
        super(entity);

    }

    @Override
    public void init(Entity anEntity) {

    }

//
//    @Override
//    public void update(Entity update)  {
//        super.update(update);
//    }
//
//    @Override
//    public void validate()  {
//        super.validate();
//    }
}
