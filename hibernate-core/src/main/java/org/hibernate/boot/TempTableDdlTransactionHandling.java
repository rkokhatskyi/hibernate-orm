/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2015, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.boot;

/**
 * Enum describing how creation and dropping of temporary tables should be done in terms of
 * transaction handling.
 *
 * @author Steve Ebersole
 */
public enum TempTableDdlTransactionHandling {
	/**
	 * No handling of transactions is needed
	 */
	NONE,
	/**
	 * Execution of the DDL must be isolated from any ongoing transaction
	 */
	ISOLATE,
	/**
	 * As with {@link #ISOLATE} the execution of the DDL must be isolated from any ongoing transaction.
	 * However, here the "isolation" will also be transacted.  Some databases require that the DDL
	 * happen within a transaction.  This value covers such cases.
	 */
	ISOLATE_AND_TRANSACT
}
