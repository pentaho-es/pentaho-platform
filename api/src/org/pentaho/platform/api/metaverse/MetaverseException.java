/*!
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2002-2013 Pentaho Corporation..  All rights reserved.
 */

package org.pentaho.platform.api.metaverse;

/**
 * MetaverseException is the base class representing an unexpected error while interacting with the metaverse.
 * 
 */
public class MetaverseException extends Exception {

  /** Default ID for serialization. */
  private static final long serialVersionUID = -947058716721047769L;

  /**
   * Instantiates a new default metaverse exception.
   */
  public MetaverseException() {
    super();
  }

  /**
   * Instantiates a new metaverse exception with the specified message.
   * 
   * @param message
   *          the message
   */
  public MetaverseException( String message ) {
    super( message );
  }

  /**
   * Instantiates a new metaverse exception from an existing Throwable.
   * 
   * @param t
   *          the Throwable to wrap
   */
  public MetaverseException( Throwable t ) {
    super( t );

  }
  /**
   * Instantiates a new metaverse exception from an existing Throwable
   * with the specified new message.
   *
   * @param message
   *          the new exception message
   * @param t
   *          the Throwable to wrap
   */
  public MetaverseException( String message, Throwable t ) {
    super( message, t );
  }

}