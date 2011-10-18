package com.ourteam.yippySMS.helpers;

import com.ourteam.yippySMS.model.Student;
import java.util.List;

/**
 * 
 * @see AutoCompleteDocument
 * @see CompletionService
 * 
 * @author dantheta
 */

    /**
     * 
     * A  CompletionService providing completion for models used in 
     *the {@link School} model.
     * 
     */
    public class ModelCompletionService implements CompletionService<String> {

        /** Our name data. */
        private List<Student> data;


	public ModelCompletionService(List<Student> data){
		this.data = data;	
	}


        /** {@inheritDoc} */
        public String autoComplete(String startsWith) {
            // Naive implementation, but good enough for the sample
            String hit = null;
            for (Student o : data) {
                if (o.toString().startsWith(startsWith)) {
                    // CompletionService contract states that we only
                    // should return completion for unique hits.
                    if (hit == null) {
                        hit = o.toString();
                    } else {
                        hit = null;
                        break;
                    }
                }
            }
            return hit;
        }

    }
