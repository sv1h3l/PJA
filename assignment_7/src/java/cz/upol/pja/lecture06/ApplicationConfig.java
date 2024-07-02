
package cz.upol.pja.lecture06;

import java.util.Set;
import jakarta.ws.rs.core.Application;

/**
 * Konfigurace REST API
 */
@jakarta.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		addRestResourceClasses(resources);
		return resources;
	}

	/**
	 * Do not modify addRestResourceClasses() method.
	 * It is automatically populated with
	 * all resources defined in the project.
	 * If required, comment out calling this method in getClasses().
	 */
	private void addRestResourceClasses(Set<Class<?>> resources) {
		resources.add(cz.upol.pja.lecture06.RestBMI.class);
	}	
}
